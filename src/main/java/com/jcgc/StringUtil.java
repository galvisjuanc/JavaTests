package com.jcgc;

import java.util.stream.IntStream;

public class StringUtil {
    public static String repeat(String str, int times) {

        if (times < 0)
            throw new IllegalArgumentException("negative values are not allowed");

        String result = "";

        for (int i = 0; i < times; i++) {
          result += str;
        }

        return result;
    }
}
