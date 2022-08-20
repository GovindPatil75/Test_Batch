package com.demo;

public class Constructors_Concepts {
	String name ;
	int id;
	// perform initialization of Object
	// 1. name of constructors --same --class name
	// 2. no return type --> not even void 
	// constructor execute Automatically ---> after creation of Object
	// for every object ---> Constuctor will be Executed Seprately
	
	public Constructors_Concepts(String name1,int id1) {   // parametrized   
		name=name1;
		id=id1;
	}
	public Constructors_Concepts(String name2) {           // parametrized
		name=name2;
	}
	
				
	public static void main(String[] args) {
		
		Constructors_Concepts concept=new Constructors_Concepts("admin",101);
		
		Constructors_Concepts c=new Constructors_Concepts("Jhon");
		
		System.out.println(concept.name); // Admin
		System.out.println(concept.id);  // 101
		
	
	}
}
