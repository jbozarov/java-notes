package com.company.optional;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {

        // Three ways of creating Optional
        // empty, of, ofNullable

        Optional<Object> emptyOptional = Optional.empty();
        System.out.println(emptyOptional.toString()); // Optional.empty

        Book book = Book.getBook().withSetId(1).withSetName("Book name").build();
        System.out.println(book.toString()); // Book is, id: 1 name is Book name

        Book bookNameEmpty = Book.getBook().withSetName(null).withSetId(1).build();
        Optional<String> ofOptional = Optional.ofNullable(bookNameEmpty.getName());
        System.out.println(ofOptional.toString()); // we get NullPointerException

        Optional<String> ofNullableOptional = Optional.ofNullable(bookNameEmpty.getName());
        System.out.println(ofNullableOptional); // We get Optional.empty

        String BOOK_IS_EMPTY = "Book is empty";
        String ofNullableOrElse = Optional.ofNullable(bookNameEmpty.getName()).orElse(BOOK_IS_EMPTY);
        System.out.println(ofNullableOrElse); // Book is empty


        // If we know the object we are passing has a null value, then we can use ofNullable:
        Optional<String> nameOptional = Optional.ofNullable(bookNameEmpty.getName());
        System.out.println(nameOptional); // Optional.empty


        // Now we can check if it is empty or present:
        if (nameOptional.isPresent()) {
            System.out.println("Present"); // Nothing because nameOptional is not present
        }

        if (nameOptional.isEmpty()) {
            System.out.println(nameOptional.orElse("Default book name")); // Optional[Default book name]
            System.out.println("Empty"); // Empty
        }

        Book bookWithLowerCase = Book.getBook().withSetId(2).withSetName("this is books lowercase name").build();

        System.out.println(Optional.ofNullable(bookWithLowerCase.getName())
                           .stream()
                           .map(String::toUpperCase)
                           .findAny()
                           .orElseThrow(() -> new NullPointerException("Class not found"))); // if null throws NullPointerException otherwise throws THIS IS BOOKS LOWERCASE NAME

    }
}
