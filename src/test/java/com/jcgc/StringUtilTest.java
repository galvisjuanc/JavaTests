package com.jcgc;

import com.jcgc.util.StringUtil;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringUtilTest {

    @Test
    public void repeat_string_once() {
        Assertions.assertEquals("hola", StringUtil.repeat("hola", 1));
    }

    @Test
    public void repeat_string_multiple_times() {
        Assertions.assertEquals("holaholahola", StringUtil.repeat("hola", 3));
    }

    @Test
    public void repeat_string_zero_times() {
        Assertions.assertEquals("", StringUtil.repeat("hola", 0));
    }

    @Test
    public void repeat_string_negative_times() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> StringUtil.repeat("hola", -1));
    }
}