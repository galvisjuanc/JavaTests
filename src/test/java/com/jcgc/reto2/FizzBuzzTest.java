package com.jcgc.reto2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class FizzBuzzTest {

    /*
    * Si el número es divisible por 3, retorna Fizz
    * Si el número es divisible por 5, retorna Buzz
    * */

    @Test
    void caseReturnFizz() {
        Assertions.assertEquals("Fizz", FizzBuzz.fizzBuzz(3));
    }

    @Test
    void caseReturnBuzz() {
        Assertions.assertEquals("Buzz", FizzBuzz.fizzBuzz(5));
    }

    @Test
    void caseReturnFizzBuzz() {
        Assertions.assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(15));
    }

    @Test
    void caseReturnNumber() {
        Assertions.assertEquals("1", FizzBuzz.fizzBuzz(1));
    }
}