package com.company.consumer;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> integerList = List.of(1, 2, 3, 4, 5, 6);
        ConsumerDemo consumer = new ConsumerDemo();
        integerList.forEach(consumer);
        integerList.forEach(System.out::println);
        integerList.forEach(t -> System.out.println("Type is " + t));
    }
}
