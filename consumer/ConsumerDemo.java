package com.company.consumer;

import java.util.function.Consumer;

public class ConsumerDemo implements Consumer<Integer> {
    @Override
    public void accept(Integer integer) {
        System.out.println("Integer item is " + integer);
    }
}
