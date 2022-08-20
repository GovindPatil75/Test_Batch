package com.demo;

public class Test {
      
	  int a=10;    // non static -variable-->instance -->declare inside the class but outside the methods
	  static int b=20;  // static varible/class variable -->
	 
	  public int run() {
		  System.out.println("Hello BugSpotter");
		return 70;
	  }
	  
	  public static void dispaly() {
		  System.out.println("Automation Test");
	  }
	  
	public static void main(String[] args) {
		
		int c=30;  // Local varibles ---> declare inside methods 
		System.out.println(c);
		System.out.println(Test.b); // static
		
		Test xyz=new Test(); // object  --used to store non static members
		System.out.println(xyz.a);  // non static
		System.out.println(xyz.run()); // method call
		
		Test.dispaly();
		
	}

}
