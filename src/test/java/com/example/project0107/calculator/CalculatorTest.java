package com.example.project0107.calculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    @DisplayName("더하기 테스트")
    void plus() {
        Calculator calculator = new Calculator();
        Double result = calculator.opperate(8, "+", 2);
        assertEquals(10.0, result, 1e-9);
    }

    @Test
    @DisplayName("빼기 테스트")
    void minus() {
        Calculator calculator = new Calculator();
        Double result = calculator.opperate(8, "-", 2);
        assertEquals(6.0, result, 1e-9);
    }

    @Test
    @DisplayName("곱하기 테스트")
    void multiply() {
        Calculator calculator = new Calculator();
        Double result = calculator.opperate(8, "*", 2);
        assertEquals(16.0, result, 1e-9);
    }

    @Test
    @DisplayName("나누기 테스트")
    void divide() {
        Calculator calculator = new Calculator();
        Double result = calculator.opperate(8, "/", 2);
        assertEquals(4.0, result, 1e-9);
    }

    @Test
    @DisplayName("0으로 나누기 테스트: null 반환")
    void divideByZeroReturnsNull() {
        Calculator calculator = new Calculator();
        Double result = calculator.opperate(8.0, "/", 0.0);
        assertNull(result);
    }

    @Test
    @DisplayName("잘못된 연산자 입력 테스트: IllegalArgumentException 발생")
    void invalidOperatorThrows() {
        Calculator calculator = new Calculator();

        IllegalArgumentException e = assertThrows(
                IllegalArgumentException.class,
                () -> calculator.opperate(8, "%", 2)
        );

        assertEquals("Invalid operation", e.getMessage());
    }
}