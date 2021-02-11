package com.company.supplier;

import java.util.function.Supplier;

public class SupplierDemo implements Supplier<Integer> {
    @Override
    public Integer get() {
        return 12;
    }
}
