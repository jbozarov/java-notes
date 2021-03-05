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
        
        // if we don't specify initial value which is first argument, then it will return Optional because there
        // might be a null return:
        Optional<Integer> optionalInteger = nums.stream().reduce(ReduceDemo::reduceFunction);
        System.out.println(optionalInteger); // Optional[23]
        System.out.println(optionalInteger.get()); // 23
        
        // return the max value
        Integer maxValue = nums.stream().reduce(0, (a, b) -> a>b ? a : b);
        System.out.println(maxValue); // 7
        
        // return method reference for max value
        Integer maxValueMethodRef = nums.stream().reduce(0, ReduceDemo::findMax);
        System.out.println(maxValueMethodRef); // 7
        
        
        // return method reference without inital value ( Optional )
        Integer maxValueMethodRefOptional = nums.stream().reduce(ReduceDemo::findMaxOptional).get(); 
        System.out.println(maxValueMethodRefOptional); // null
        
        
        // return method reference without inital value ( Optional )
        Optional<Integer> maxValueMethodRefOptional = Optional.of(nums.stream().reduce(ReduceDemo::findMaxOptional).orElse(15));
        System.out.println(maxValueMethodRefOptional); // null
    }
    
    
        private static Integer findMaxOptional(Integer integer, Integer integer1) {
            return null;
        }

        private static Integer findMax(Integer a, Integer b) {
            return a > b ? a : b;
        }


        public static Integer reduceFunction(int a, int b) {
            return 23;
        }

}
