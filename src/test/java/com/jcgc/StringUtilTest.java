package com.jcgc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringUtilTest {

    @Test
    public void testRepeat() {
        Assertions.assertEquals("holaholahola", StringUtil.repeat("hola", 3));
        Assertions.assertEquals("hola", StringUtil.repeat("hola", 1));
    }

}