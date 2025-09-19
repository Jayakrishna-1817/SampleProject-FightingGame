package com.example.jayakrishna;

public class Utility {

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static boolean isDivisible(int num, int divisor) {
        return num % divisor == 0;
    }

    public static int max(int a, int b) {
        return (a > b) ? a : b;
    }

    public static int maxOfThree(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    public static void printOneToTen() {
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static boolean compareEvenOdd(int even, int odd) {
        return even > odd;
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double divide(int a, int b) {
        if (b == 0) throw new ArithmeticException("Cannot divide by zero");
        return (double) a / b;
    }

    public static long factorial(int n) {
        long fact = 1;
        for (int i = 1; i <= n; i++) fact *= i;
        return fact;
    }

    public static double areaCircle(double radius) {
        return Math.PI * radius * radius;
    }

    public static int areaSquare(int side) {
        return side * side;
    }

    public static int areaRectangle(int length, int breadth) {
        return length * breadth;
    }

    public static double areaTriangle(double base, double height) {
        return 0.5 * base * height;
    }

    public static double squareRoot(double num) {
        return Math.sqrt(num);
    }
}
