package ru.clevertec;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        if (str == null) {
            return false;
        }
        try {
            double num = Double.parseDouble(str);
            return num > 0;
        } catch (NumberFormatException ex) {
            return false;
        }
    }
}
