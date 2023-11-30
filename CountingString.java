package com.sumit.practice;



 class ArithmeticExceptionExample {
    public static void main(String[] args) {
        try {
            // Division by zero
            int numerator = 10;
            int denominator = 0;
            int result = numerator / denominator;

            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.err.println("ArithmeticException: " + e.getMessage());
        }
    }
}
