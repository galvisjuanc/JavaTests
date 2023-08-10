package com.jcgc;

import java.util.stream.IntStream;

public class StringUtil {
    public static String repeat(String str, int times) {
        return IntStream.range(0, times).mapToObj(i -> str).reduce("", (s1, s2) -> s1 + s2);
    }
}
