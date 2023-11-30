package com.sumit.practice;

public class ReverseString {
public static void main(String[] args) {
	
	String name="Oppo";
	String rev="";
	
	for(int i=name.length()-1;i>=0;i--) {
		rev=rev+name.charAt(i);
	}
	System.out.println(rev);
	
	//palindrome
	if(rev.equals(name)) {
		System.out.println("This is palindrome");
	}else {
		System.out.println("This is not palindrome");
	}
}
}
