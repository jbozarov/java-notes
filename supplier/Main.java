package com.company.supplier;

import java.util.List;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {

        List<Integer> numbersList = List.of(1, 2, 3, 4, 5, 6, 7, 8);

        SupplierDemo supplier = new SupplierDemo();

        System.out.println(numbersList.stream().findAny().orElseGet(supplier)); // 1


        List<Integer> emptyList = List.of();


        Supplier<Integer> sup = new Supplier<Integer>() {
            @Override
            public Integer get() {
                return 122;
            }
        };

        System.out.println(emptyList.stream().findAny().orElseGet(sup)); // 12, because it cannot find any

    }
}
