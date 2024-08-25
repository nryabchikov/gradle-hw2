package ru.clevertec;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UtilsTest {

    @Test
    void isAllPositiveNumbers() {
        assertTrue(Utils.isAllPositiveNumbers("12", "79", "15.4"));
        assertFalse(Utils.isAllPositiveNumbers("-12", "79", "15.4"));
        assertFalse(Utils.isAllPositiveNumbers("12", "79", "0"));
        assertFalse(Utils.isAllPositiveNumbers("12", "79", ""));
        assertFalse(Utils.isAllPositiveNumbers("12", "79", null));
        assertFalse(Utils.isAllPositiveNumbers("12s312", "43gse2"));
    }
}