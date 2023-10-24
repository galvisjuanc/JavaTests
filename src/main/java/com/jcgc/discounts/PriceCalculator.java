package com.jcgc.discounts;

import java.util.ArrayList;
import java.util.List;

public class PriceCalculator {

    private List<Double> prices = new ArrayList<>();
    private double discount = 0;
    public double getTotal() {
        double result = 0;
        for(Double price: prices){
            result += price;
        }
        return result * ((100 - discount) / 100);
    }

    public void addPrice(double v) {
        prices.add(v);
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}
