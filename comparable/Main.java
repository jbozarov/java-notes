package com.company.comparable;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(12, 3, 433, -34, 34);
        Collections.sort(numbers);
        System.out.println(numbers);  // [-34, 3, 12, 34, 433] sorted automatically

        // Now lets try to sort objects ?

        List<Book> bookList = Arrays.asList(
                new Book(3, "Some Book", 33.0),
                new Book(1, "Java Book", 12.55),
                new Book(2, "Clean Code", 44.23));

        // Collections.sort(bookList); // compilation error why because it does not know what to sort by ?
        // So we need to implement Comparable functional interface and override (specify) sort by:

        Collections.sort(bookList);
        System.out.println(bookList.toString());
        for (Book b : bookList) {
            System.out.println(b.getBookName()); // Clean Code, Some Book, Java Book
        }
    }
}
