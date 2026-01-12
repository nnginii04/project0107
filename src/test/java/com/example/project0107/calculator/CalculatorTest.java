package com.example.project0107.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test
    @DisplayName("더하기 테스트")
    void test1() {
        Calculator calculator = new Calculator();
        Double result = calculator.opperate(8, "+", 2);
        System.out.println("result = " + result);

        Assertions.assertEquals(10,  result);

    }
}

class CalculaorTest2 {
    @Test
    @DisplayName("나누기 테스트")
    void test2() {
        Calculator calculator = new Calculator();
        Double result = calculator.opperate(8, "/", 2);
        System.out.println("result = " + result);

        Assertions.assertEquals(4,  result);
    }
}