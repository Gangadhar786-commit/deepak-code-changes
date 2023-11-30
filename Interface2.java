package com.sumit.practice;


import java.util.Scanner;

     class StringCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input string
        System.out.print("Enter the input string: ");
        String inputString = scanner.nextLine();

        // Target string to count
        System.out.print("Enter the target string to count: ");
        String targetString = scanner.nextLine();

        // Count occurrences
        int count = countOccurrences(inputString, targetString);

        // Display the result
        System.out.println("The target string appears " + count + " times in the input string.");
        
        // Close the scanner
        scanner.close();
    }

    public static int countOccurrences(String inputString, String targetString) {
        int count = 0;
        int lastIndex = 0;

        while (lastIndex != -1) {
            lastIndex = inputString.indexOf(targetString, lastIndex);

            if (lastIndex != -1) {
                count++;
                lastIndex += targetString.length();
            }
        }

        return count;
    }
}
