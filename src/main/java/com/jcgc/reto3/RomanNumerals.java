package com.jcgc.reto3;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class RomanNumerals {
    public static String arabicToRoman(int n) {
        String result = "";
        HashMap<String, Integer> romanNumerals = new LinkedHashMap();

        romanNumerals.put("M", 1000);
        romanNumerals.put("CM", 900);
        romanNumerals.put("D", 500);
        romanNumerals.put("CD", 400);
        romanNumerals.put("C", 100);
        romanNumerals.put("XC", 90);
        romanNumerals.put("L", 50);
        romanNumerals.put("XL", 40);
        romanNumerals.put("X", 10);
        romanNumerals.put("IX", 9);
        romanNumerals.put("V", 5);
        romanNumerals.put("IV", 4);
        romanNumerals.put("I", 1);



        for (Map.Entry<String, Integer> entry : romanNumerals.entrySet()) {
            String roman = entry.getKey();
            Integer arabic = entry.getValue();

            if (arabic == 1000 || arabic == 100 || arabic == 10 || arabic == 1) {
                while (n >= arabic) {
                    result += roman;
                    n = n - arabic;
                }
            } else {
                if (n >= arabic) {
                    result += roman;
                    n = n - arabic;
                }
            }
        }

        return result;
    }
}
