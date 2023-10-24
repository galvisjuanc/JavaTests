package com.jcgc.discounts;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

class PriceCalculatorShould {

    @Test
    public void total_zero_when_there_are_prices() {
        PriceCalculator calculator = new PriceCalculator();
        assertThat(calculator.getTotal(), is(0.0));
    }

    @Test
    void total_is_the_sum_of_prices() {
        PriceCalculator calculator = new PriceCalculator();
        calculator.addPrice(10.2);
        calculator.addPrice(15.5);

        assertThat(calculator.getTotal(), is(25.7));
    }
}