package com.company.comparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Book> bookList = Arrays.asList(
                new Book(3, "Some Book", 33.0),
                new Book(1, "Java Book", 12.55),
                new Book(2, "Clean Code", 44.23));

        // Collections.sort(bookList); // compilation error why because it does not know what to sort by ?
        // So we need to implement Comparator by creating BookComparator class :

        Collections.sort(bookList, new BookComparator());
        System.out.println(bookList.toString());
        for (Book b : bookList) {
            System.out.println(b.getBookName()); // Clean Code, Some Book, Java Book
        }

        // Java 8
        Comparator<Book> c1 = Comparator.comparing(Book::getPrice);
        Collections.sort(bookList, c1);
        for (Book book : bookList) {
            System.out.println(book.getBookName());  // Java Book, Some Book, Clean Code 
        }
    }
}

