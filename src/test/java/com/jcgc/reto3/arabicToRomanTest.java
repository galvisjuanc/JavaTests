package com.jcgc.reto3;

import org.hamcrest.CoreMatchers;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class arabicToRomanTest {
    /**
     * arabicToRoman(1) => "I"
     * arabicToRoman(2) => "II"
     * arabicToRoman(3) => "III"
     *
     * arabicToRoman(5) => "V"
     * arabicToRoman(6) => "VI"
     * arabicToRoman(7) => "VII"
     *
     * arabicToRoman(10) => "X"
     * arabicToRoman(11) => "XI"
     * arabicToRoman(15) => "XV"
     * arabicToRoman(16) => "XVI"
     *
     * arabicToRoman(50) => "L"
     * arabicToRoman(51) => "LI"
     * arabicToRoman(55) => "LV"
     * arabicToRoman(56) => "LVI"
     * arabicToRoman(60) => "LX"
     * arabicToRoman(70) => "LXX"
     *
     * arabicToRoman(80) => "LXXX"
     * arabicToRoman(81) => "LXXXI"
     * arabicToRoman(85) => "LXXXV"
     * arabicToRoman(86) => "LXXXVI"
     *
     * arabicToRoman(126) => "CXXVI"
     *
     * arabicToRoman(2507) => "MMDVII"
     */


    @Test
    public void roman_numbers_when_1_2_3() {

        assertThat(RomanNumerals.arabicToRoman(1), CoreMatchers.is("I"));
        assertThat(RomanNumerals.arabicToRoman(2), CoreMatchers.is("II"));
        assertThat(RomanNumerals.arabicToRoman(3), CoreMatchers.is("III"));

    }

    @Test
    public void roman_numbers_when_5_6_7() {

        assertThat(RomanNumerals.arabicToRoman(5), CoreMatchers.is("V"));
        assertThat(RomanNumerals.arabicToRoman(6), CoreMatchers.is("VI"));
        assertThat(RomanNumerals.arabicToRoman(7), CoreMatchers.is("VII"));

    }

    @Test
    public void roman_numbers_when_10_11_15_16() {

        assertThat(RomanNumerals.arabicToRoman(10), CoreMatchers.is("X"));
        assertThat(RomanNumerals.arabicToRoman(11), CoreMatchers.is("XI"));
        assertThat(RomanNumerals.arabicToRoman(15), CoreMatchers.is("XV"));
        assertThat(RomanNumerals.arabicToRoman(16), CoreMatchers.is("XVI"));

    }

    @Test
    public void roman_numbers_when_50_51_55_56() {

        assertThat(RomanNumerals.arabicToRoman(50), CoreMatchers.is("L"));
        assertThat(RomanNumerals.arabicToRoman(51), CoreMatchers.is("LI"));
        assertThat(RomanNumerals.arabicToRoman(55), CoreMatchers.is("LV"));
        assertThat(RomanNumerals.arabicToRoman(56), CoreMatchers.is("LVI"));

    }

    @Test
    public void roman_numbers_when_60_70() {

        assertThat(RomanNumerals.arabicToRoman(60), CoreMatchers.is("LX"));
        assertThat(RomanNumerals.arabicToRoman(70), CoreMatchers.is("LXX"));

    }

    @Test
    public void roman_numbers_when_80_81_85_86() {

        assertThat(RomanNumerals.arabicToRoman(80), CoreMatchers.is("LXXX"));
        assertThat(RomanNumerals.arabicToRoman(81), CoreMatchers.is("LXXXI"));
        assertThat(RomanNumerals.arabicToRoman(85), CoreMatchers.is("LXXXV"));
        assertThat(RomanNumerals.arabicToRoman(86), CoreMatchers.is("LXXXVI"));

    }

    @Test
    public void roman_numbers_when_126() {

        assertThat(RomanNumerals.arabicToRoman(126), CoreMatchers.is("CXXVI"));
    }

    @Test
    public void roman_numbers_when_2507() {

        assertThat(RomanNumerals.arabicToRoman(2507), CoreMatchers.is("MMDVII"));
    }

    /**
     * arabicToRoman(4) => "IV"
     * arabicToRoman(14) => "XIV"
     * arabicToRoman(24) => "XXIV"
     *
     * arabicToRoman(40) => "XL"
     * arabicToRoman(44) => "XLIV"
     *
     * arabicToRoman(400) => "CD"
     *
     * arabicToRoman(9) => "IX"
     * arabicToRoman(19) => "XIX"
     * arabicToRoman(49) => "XLIX"
     *
     * arabicToRoman(90) => "XC"
     * arabicToRoman(99) => "XCIX"
     *
     * arabicToRoman(900) => "CM"
     */

    @Test
    public void roman_numbers_when_4_14_24() {

        assertThat(RomanNumerals.arabicToRoman(4), CoreMatchers.is("IV"));
        assertThat(RomanNumerals.arabicToRoman(14), CoreMatchers.is("XIV"));
        assertThat(RomanNumerals.arabicToRoman(24), CoreMatchers.is("XXIV"));

    }

    @Test
    public void roman_numbers_when_40() {

        assertThat(RomanNumerals.arabicToRoman(40), CoreMatchers.is("XL"));
        assertThat(RomanNumerals.arabicToRoman(44), CoreMatchers.is("XLIV"));

    }

    @Test
    public void roman_numbers_when_400() {

        assertThat(RomanNumerals.arabicToRoman(400), CoreMatchers.is("CD"));

    }

    @Test
    public void roman_numbers_when_9_19_49() {

        assertThat(RomanNumerals.arabicToRoman(9), CoreMatchers.is("IX"));
        assertThat(RomanNumerals.arabicToRoman(19), CoreMatchers.is("XIX"));
        assertThat(RomanNumerals.arabicToRoman(49), CoreMatchers.is("XLIX"));

    }

    @Test
    public void roman_numbers_when_90_99() {

        assertThat(RomanNumerals.arabicToRoman(90), CoreMatchers.is("XC"));
        assertThat(RomanNumerals.arabicToRoman(99), CoreMatchers.is("XCIX"));

    }

    @Test
    public void roman_numbers_when_900() {

        assertThat(RomanNumerals.arabicToRoman(900), CoreMatchers.is("CM"));

    }
}