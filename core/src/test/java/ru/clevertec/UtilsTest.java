package ru.clevertec;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.EmptySource;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

class UtilsTest {

    @ParameterizedTest
    @CsvSource({
            "12, 79, 15.4"
    })
    void isAllPositiveNumbersValidCases(String num1, String num2, String num3) {
        assertTrue(Utils.isAllPositiveNumbers(num1, num2, num3));
    }

    @ParameterizedTest
    @CsvSource({
            "-12, 79, 15.4",
            "12, 79, 0",
            "12, 79, ''",
            "12s312, 43gse2"
    })
    void isAllPositiveNumbersInvalidCases(String num1, String num2, String num3) {
        assertFalse(Utils.isAllPositiveNumbers(num1, num2, num3));
    }

    @ParameterizedTest
    @NullSource
    @EmptySource
    void isAllPositiveNumbersNullOrEmptyCases(String input) {
        assertFalse(Utils.isAllPositiveNumbers("12", "79", input));
    }
}
