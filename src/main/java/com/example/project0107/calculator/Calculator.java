package com.example.project0107.calculator;

public class Calculator {
    /**
     * 계산기 4칙 연산 함수
     * @param num1 : 입력값 1
     * @param op : 연산자
     * @param num2 : 입력값 2
     * @return : result
     */
    public Double opperate(double num1, String op, double num2) {
        switch (op) {
            case "*":
                return num1 * num2;
            case "/":
                if (num2 != 0) {
                    return num1 / num2;
                } else {
                    return null;
                }
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;

            default:
                throw new IllegalArgumentException("Invalid operation");
        }
    }
}
