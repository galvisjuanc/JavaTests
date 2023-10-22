package com.jcgc;

import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

public class StringUtilTest {

    public static void main(String[] args) {
        Assertions.assertEquals(StringUtil.repeat("hola", 3), "holaholahola");
        Assertions.assertEquals(StringUtil.repeat("hola", 1), "hola");
    }

}