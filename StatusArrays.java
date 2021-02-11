package com.company.katas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StatusArrays {
    public static int[] status(int[] nums) {

        List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());

        List<Integer> result = new ArrayList<>();

        for (int i = 0; i<nums.length; i++ ) {
            List<Integer> innerList = Arrays.stream(nums).boxed().collect(Collectors.toList());
            int finalI = i;
            int size = (int) innerList.stream().filter(v -> v < list.get(finalI)).count() + finalI;
            System.out.println(size + " + " + finalI);
            result.add(size);

        }

        return result.stream().mapToInt(i -> i).toArray();
    }
}
