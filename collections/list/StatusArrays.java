package com.company.katas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StatusArrays {
    
    public static void main(String[] args) {
        int[] n = {6, 9, 3, 8, 2, 3, 1};
        System.out.println(Arrays.toString(status(n)));
    }

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
