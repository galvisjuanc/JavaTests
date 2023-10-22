package com.jcgc;

public class PasswordUtil {

    public enum SecurityLevel {
        WEAK, MEDIUM, STRONG
    }
    public static SecurityLevel assessPassword(String password) {

        return SecurityLevel.WEAK;
    }
}
