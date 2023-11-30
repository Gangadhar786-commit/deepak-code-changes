package com.sumit.practice;

 class NumberFormatExceptionExample {
    public static void main(String[] args) {
        // Trying to convert a non-numeric string to an integer
        String nonNumericString = "Hello, World!";

        try {
            int numericValue = Integer.parseInt(nonNumericString);
            System.out.println("Parsed value: " + numericValue);
        } catch (NumberFormatException e) {
            // Catching the exception and printing an error message
            System.out.println("NumberFormatException caught!");
            e.printStackTrace();
        }
    }
}
