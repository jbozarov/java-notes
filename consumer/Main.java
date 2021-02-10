package com.company.consumer;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        
        List<Integer> integerList = List.of(1, 2, 3, 4, 5, 6);
        ConsumerDemo consumer = new ConsumerDemo();
        
        integerList.forEach(consumer); 
//         Integer item is 1
//         Integer item is 2
//         Integer item is 3
//         Integer item is 4
//         Integer item is 5
//         Integer item is 6
        
        
        integerList.forEach(System.out::println);
//         1
//         2
//         3
//         4
//         5
//         6

        
        integerList.forEach(t -> System.out.println("Type is " + t));
//         Type is 1
//         Type is 2
//         Type is 3
//         Type is 4
//         Type is 5
//         Type is 6
        
    }
}
