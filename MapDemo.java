package com.company.map;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo {


    // <R> Stream<R> map(Function<? super T, ? extends R> mapper)
    // Map is Transforming data

    public static void main(String[] args) {
        List<Integer> nums = List.of(1, 2, 4, 4, 5, 6, 7);

        List<Integer> numsTen = nums.stream().map(a -> a * 10).collect(Collectors.toList());
        System.out.println(Arrays.toString(numsTen.toArray())); // [10, 20, 40, 40, 50, 60, 70]

        List<Integer> mapFunctionResult = nums.stream().map(MapDemo::mapFunction).collect(Collectors.toList());
        System.out.println(Arrays.toString(mapFunctionResult.toArray()));  // [23, 23, 23, 23, 23, 23, 23]
        
        //Optional
        List<Integer> optionalList = (List<Integer>) nums.stream()
                .filter(v -> v>0)
                .map(MapDemo::optionalFunction);
    }

    public static Integer mapFunction(Integer val) {
        return 23;
    }
}
