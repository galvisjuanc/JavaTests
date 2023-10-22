package com.jcgc;

import org.junit.jupiter.api.Test;

import static com.jcgc.PasswordUtil.SecurityLevel.MEDIUM;
import static com.jcgc.PasswordUtil.SecurityLevel.WEAK;
import static org.junit.jupiter.api.Assertions.*;

class PasswordUtilTest {

    @Test
    void weak_when_has_less_than_8_letters() {
        assertEquals(WEAK, PasswordUtil.assessPassword("1234567"));
    }

    @Test
    void weak_when_has_only_letters() {
        assertEquals(WEAK, PasswordUtil.assessPassword("abcdefgh"));
    }

    @Test
    void medium_when_has_letters_and_numbers() {
        assertEquals(MEDIUM, PasswordUtil.assessPassword("abcd1234"));
    }
}