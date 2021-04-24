package com.company.optional;

import java.util.List;
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




        Book b1 = new Book(11, "Book one");
        Book b2 = new Book(12, "Book two");
        Book b3 = new Book(13, "Book three");
        Book b4 = new Book(14, "Book four");
        List<Book> books = List.of(b1, b2, b3, b4);

        Book result = filterBook(books, "fake name");
        System.out.println("result book is " + result.toString()); // result book is Book is, id: 15 name is Book five

        Book result2 = filterBook(books, "Book three");
        System.out.println("result book is " + result2.toString()); //result book is Book is, id: 13 name is Book three

    }





    // Try to filter the Books by name
    // we can set default book or throw exception

    public static Book filterBook(List<Book> bookList, String name) {
        return bookList
                .stream()
                .filter(v -> v.getName().equals(name))
                .findAny()
                .orElse(new Book(15, "Book five"));
                //.orElseThrow(() -> new NullPointerException("there is no book found with given name"));
    }

}
