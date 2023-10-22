package com.jcgc;

import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

public class StringUtilTest {

    public static void main(String[] args) {
        Assertions.assertEquals("holaholahola", StringUtil.repeat("hola", 3));
        Assertions.assertEquals("hola", StringUtil.repeat("hola", 1));
    }

}