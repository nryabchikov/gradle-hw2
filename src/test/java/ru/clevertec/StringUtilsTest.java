package ru.clevertec;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class StringUtilsTest {

    @ParameterizedTest
    @ValueSource(strings = {"2.321", "13213"})
    void isPositiveNumberValidCases(String input) {
        assertTrue(StringUtils.isPositiveNumber(input));
    }

    @ParameterizedTest
    @CsvSource({
            "2.32fs1",
            "0",
            "-12321"
    })
    void isPositiveNumberInvalidCases(String input) {
        assertFalse(StringUtils.isPositiveNumber(input));
    }

    @ParameterizedTest
    @EmptySource
    @NullSource
    void isPositiveNumberEmptyAndNullCases(String input) {
        assertFalse(StringUtils.isPositiveNumber(input));
    }
}
