package ru.skypro.calculatorind20.utils;

public class TestUtils {

    public static String formatResult(int num1, int num2, String action, String result) {
        return String.format("%s %s %s = %s", num1, action, num2, result);
    }
}
