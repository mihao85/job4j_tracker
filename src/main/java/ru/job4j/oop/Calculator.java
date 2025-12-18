package ru.job4j.oop;

public class Calculator {
    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public int multiply(int a) {
        return x * a;
    }

    public static int minus(int b) {
        return b - x;
    }

    public int divide(int c) {
        return c / x;
    }

    public int sumAllOperation(int g) {
        return sum(g) + multiply(g) + minus(g) + divide(g);
    }

    public static void main(String[] args) {
        int resultSum = Calculator.sum(10);
        Calculator calculator = new Calculator();
        int resultMultiply = calculator.multiply(5);
        int resultMinus = minus(8);
        int sumAllOperationG = calculator.sumAllOperation(6);
        System.out.println(resultSum);
        System.out.println(resultMultiply);
        System.out.println(resultMinus);
        System.out.println(sumAllOperationG);
    }
}
