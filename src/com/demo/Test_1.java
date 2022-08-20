package com.demo;

public class Test_1 {

	public static void main(String[] args) {
		String s1=new String("Test");
		String s2=new String("Test");

		String s3="Test";    // Test --s3 ,s4  ---scp ---> Test --s3,s4
		String s4="Test";

		System.out.println(s1==s2); // false
		System.out.println(s1.equals(s2)); // true
		
		System.out.println(s3==s4); // true == ---> refrence comparision --->same object
		System.out.println(s3.equals(s4));// true
		
		
		
		String name="Bug  Spotter";
		String file="test.pdf";
		System.out.println(name.length()); // provide length of string
		
		//toUpperCase---convert--into Uppercase
		System.out.println(name.toUpperCase());
		
		System.out.println(name.toLowerCase()); // convert string into lower case
		
		System.out.println(name.startsWith("Bug")); // 
		
		System.out.println(name.endsWith("ter")); // 
				
	}
}
