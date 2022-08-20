package com.demo;

public class StringMethods {

	public static void main(String[] args) {
		
		String name="Bug Spotter"; // literals ---> SCP
		String name1="bug Spotter";
		//length()----> string length provide --> int
		 System.out.println(name.length()); // 11
		 
		//equals() ----> content comparision --> boolean  // false
		 System.out.println(name.equals(name1));
		
		 //equqalsignorecase() --> case ignore
		 System.out.println(name.equalsIgnoreCase(name1));
		 
		 //contains() ---> boolean
		 System.out.println(name.contains("Bug"));
		 
		 //tpUppercase() --Upper letter
		 System.out.println(name.toUpperCase());
		 
		 //tolowerCase()
		 System.out.println(name.toLowerCase());
		 
		 //startwith() --> boolean
		 System.out.println(name.startsWith("Bug"));
		 
		 //endswith() --> boolean 
		 System.out.println(name.endsWith("er"));
		 
		 //CharAt() -----> return character at specified index . --> char
		 System.out.println(name.charAt(3));  // p
		 
		 //Valueof() ----> convert to string --->
		 double d=123.0;
		 int a=10;
		 String data=String.valueOf(d);
		 String dataint=String.valueOf(a);
		 System.out.println(dataint);
		 
		 System.out.println(data); // 123.0
		 
		 //replace() ---->
		 String t=" data  ";
		 System.out.println(t.replace("a","A")); // 123A
		 
		 //concat() ----> combined two string --> String
		 System.out.println(t+data);
		 System.out.println(name.concat(name1)); //
		 System.out.println(t);
		 System.out.println(t.trim()); // remove spaces start and end // data ---> 
	}
}
