package com.company.predicate;

import java.util.List;

public class Main {

    public static void main(String[] args) {

    List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8);
    PredicateDemo predicate = new PredicateDemo();

    numbers.stream().filter(predicate).forEach(System.out::println);

    }
}
