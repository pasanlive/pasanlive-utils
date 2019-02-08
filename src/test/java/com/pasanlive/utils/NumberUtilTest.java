package com.pasanlive.utils;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class NumberUtilTest {

    @Test
    public void isValidIntegerTest() {
        final String[] validValues = {"1", "0", "23", "345344", "000032223", "000000", "3"};

        for (String val : validValues) {
            assertTrue(NumberUtil.isValidInteger(val));
        }

        final String[] invalidValues = {"a", "sds", "dffdsfs3", "2132423a", "232.2", "0.0", "22@q", " ", null};
        for (String val : invalidValues) {
            assertFalse(NumberUtil.isValidInteger(val));
        }
    }
}