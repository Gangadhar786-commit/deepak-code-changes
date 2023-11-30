package com.sumit.practice;

public class DemoString {

	public static void main(String[] args) {
		String s1=new String("sumit");
		String s2=new String("sumit");
		String s3="ajay";
		String s4="Pawan";
		String s5=s2;
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1==s4);
		System.out.println(s5==s2);
	    System.out.println(s5.equals(s2));
     	System.out.println(s5==s3);
     
     	for(char ch:s1.toCharArray()) {
     		System.out.println(ch+":"+(int)ch);
     		
		String name="Sumit";
		String rev="";
		
		for(int i=name.length()-1;i>=0;i--) {
			rev=rev+name.charAt(i);
		}
		System.out.println(rev);
     			
     		}
     	
		

	}


