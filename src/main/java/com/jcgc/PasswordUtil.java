package com.jcgc;

public class PasswordUtil {

    public enum SecurityLevel {
        WEAK, MEDIUM, STRONG
    }
    public static SecurityLevel assessPassword(String password) {

        if (password.length() < 8) {
            return SecurityLevel.WEAK;
        }
        if (password.matches("[a-zA-Z]+")) {
            return SecurityLevel.WEAK;
        }

        return SecurityLevel.MEDIUM;
    }
}
