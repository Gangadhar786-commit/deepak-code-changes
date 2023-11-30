package com.sumit.practice;

 class ArrayIndexOutOfBoundsExceptionExample {
    public static void main(String[] args) {
        // Creating an array with size 5
        int[] numbers = new int[5];

        try {
            // Accessing an index outside the bounds of the array (index 10)
            int value = numbers[10];
        } catch (ArrayIndexOutOfBoundsException e) {
            // Catching the exception and printing an error message
            System.out.println("ArrayIndexOutOfBoundsException caught!");
            e.printStackTrace();
        }
    }
}
