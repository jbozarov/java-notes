package com.company.predicate;

import java.util.function.Predicate;

public class PredicateDemo implements Predicate<Integer> {

    @Override
    public boolean test(Integer integer) {
        return integer % 2 == 0;
    }
}
