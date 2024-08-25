package ru.clevertec;

public class Utils {
    public static boolean isAllPositiveNumbers(String... str) {
        for (String elem: str) {
            if (!StringUtils.isPositiveNumber(elem)) {
                return false;
            }
        }
        return true;
    }
}
