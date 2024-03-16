package ru.skypro.calculatorind20.service;

import org.junit.jupiter.api.Test;
import ru.skypro.calculatorind20.utils.TestUtils;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceTest {

    private CalculatorService calculatorService = new CalculatorService();

    @Test
    void greeting_success() {
        //Подготовка ожидаемого результата
        String expectedResult = "Добро пожаловать в калькулятор";

        //Начало теста
        String actualResult = calculatorService.greeting();
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void plus_success() {
        //Подготовка входных данных
        int num1 = 4;
        int num2 = 6;

        //Подготовка ожидаемого результата
        String expectedResult = TestUtils.formatResult(num1, num2, "+", String.valueOf(num1 + num2));

        //Начало теста
        String actualResult = calculatorService.plus(num1, num2);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void minus_success() {
        //Подготовка входных данных
        int num1 = 43;
        int num2 = 89;

        //Подготовка ожидаемого результата
        String expectedResult = TestUtils.formatResult(num1, num2, "-", String.valueOf(num1 - num2));

        //Начало теста
        String actualResult = calculatorService.minus(num1, num2);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void multiply_success() {
        //Подготовка входных данных
        int num1 = 34;
        int num2 = 8239;

        //Подготовка ожидаемого результата
        String expectedResult = TestUtils.formatResult(num1, num2, "*", String.valueOf(num1 * num2));

        //Начало теста
        String actualResult = calculatorService.multiply(num1, num2);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void divide_success() {
        //Подготовка входных данных
        int num1 = 34;
        int num2 = 8239;

        //Подготовка ожидаемого результата
        String expectedResult = TestUtils.formatResult(num1, num2, "/", String.valueOf((double) num1 / (double) num2));

        //Начало теста
        String actualResult = calculatorService.divide(num1, num2);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void divide_withIllegalArgumentException() {
        //Подготовка входных данных
        int num1 = 9;
        int num2 = 0;

        //Подготовка ожидаемого результата
        String expectedMessage = "На ноль делить нельзя!";

        //Начало теста
        Exception exception = assertThrows(IllegalArgumentException.class, () -> calculatorService.divide(num1, num2));
        assertEquals(expectedMessage, exception.getMessage());
    }
}
