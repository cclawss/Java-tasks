package com.company.shopV1;

import java.util.Comparator;

public class Sort implements Comparator <Product>{


    @Override
    public int compare(Product o1, Product o2) {
        return o1.getDescription().compareTo(o2.getDescription());
    }
}
