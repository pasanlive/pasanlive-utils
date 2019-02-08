package com.pasanlive.utils;

public class NumberUtil {

    /**
     * Validate the given String is valid integer
     *
     * @param value String value
     * @return boolean
     */
    public static boolean isValidInteger(final String value) {
        if (value == null) {
            return false;
        }
        if (value.isEmpty()) {
            return false;
        }
        int i = 0;
        if (value.charAt(0) == '-') {
            if (value.length() == 1) {
                return false;
            }
            i = 1;
        }
        for (; i < value.length(); i++) {
            char c = value.charAt(i);
            if (c < '0' || c > '9') {
                return false;
            }
        }
        return true;
    }
}
