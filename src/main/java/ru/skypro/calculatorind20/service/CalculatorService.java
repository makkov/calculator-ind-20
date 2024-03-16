package ru.skypro.calculatorind20.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public String greeting() {
        return "Добро пожаловать в калькулятор";
    }

    public String plus(int num1, int num2) {
        return formatResult(num1, num2, "+", String.valueOf(num1 + num2));
    }

    public String minus(int num1, int num2) {
        return formatResult(num1, num2, "-", String.valueOf(num1 - num2));
    }

    public String multiply(int num1, int num2) {
        return formatResult(num1, num2, "*", String.valueOf(num1 * num2));
    }

    public String divide(int num1, int num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException("На ноль делить нельзя!");
        }
        return formatResult(num1, num2, "/", String.valueOf((double) num1 / (double) num2));
    }

    private String formatResult(int num1, int num2, String action, String result) {
        return String.format("%s %s %s = %s", num1, action, num2, result);
    }
}
