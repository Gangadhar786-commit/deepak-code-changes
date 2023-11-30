package com.sumit.practice;



import java.util.Optional;

 class NullPointerExceptionExample {
    public static void main(String[] args) {
        try {
            // Using Optional to handle null value
            String str = null;
            Optional<String> optionalStr = Optional.ofNullable(str);
            
            int length = optionalStr.map(String::length).orElse(0);

            System.out.println("Length of the string: " + length);
        } catch (NullPointerException e) {
            System.err.println("NullPointerException: " + e.getMessage());
        }
    }
}
