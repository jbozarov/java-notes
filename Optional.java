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
        Optional<String> idOptional = Optional.of(bookNameEmpty.getName());
        System.out.println(idOptional.toString()); // we get NullPointerException

        Optional<Book> bookNameNullOptional = Optional.of(bookNameEmpty);
        Book mightBeEmpty = bookNameNullOptional.stream().filter(v -> v.getId() == 1).filter(n -> n.getName().length() > 0).findAny().orElse(book); // throws NullPointerException


        // If we know the object we are passing has a null value, then we can use ofNullable:
        Optional<String> nameOptional = Optional.ofNullable(bookNameEmpty.getName());
        System.out.println(nameOptional); // Optional.empty

    }
}
