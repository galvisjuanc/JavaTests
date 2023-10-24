package com.jcgc.discounts;

import java.util.ArrayList;
import java.util.List;

public class PriceCalculator {

    private List<Double> prices = new ArrayList<>();
    public double getTotal() {
        double result = 0;
        for(Double price: prices){
            result += price;
        }
        return result;
    }

    public void addPrice(double v) {
        prices.add(v);
    }
}
