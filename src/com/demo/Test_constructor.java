package com.demo;

public class Test_constructor {

	String name; // instance variable
	
	public Test_constructor() {  // no argument constrctors
		name="Bug";
	}
	
	public Test_constructor(String name) { // parametrised
		this.name=name;
	}
	public static void main(String[] args) {
		Test_constructor a=new Test_constructor("Admin"); // Object Creation --> new
		
		 // default constructor
		// No argument --Used defined
		System.out.println(a.name); // null // Bug

	}

}
