package com.company.reduce;

import java.util.ArrayList;
import java.util.List;

public class ReduceDemo {

    // Reduce -> Aggregating the data 
    // T reduce (T identity, BinaryOperator<T> accumulator);
    // Identity is initial value of T
    // accumulator is a function for combining the values

    public static void main(String[] args) {
        List<Integer> nums = List.of(1, 2, 4, 4, 5, 6, 7);
        Integer sum = nums.stream().reduce(100, (a, b) -> a + b);
        System.out.println(sum);

        Integer deductedSum = nums.stream().reduce(0, (a, b) -> a - b );
        System.out.println(deductedSum);

        // We can create method and pass it into stream reduce
        Integer resultOfFunction = nums.stream().reduce(20, ReduceDemo::reduceFunction);
        System.out.println(resultOfFunction);  // 23
    }


    public static Integer reduceFunction(int a, int b) {
        return 23;
    }

}
