package Encapsulations;

public class Test_Encapsulation {
	
	//1.declare the variable as private
	//2.provide public getter and setter --> modify and view 
	private String name; // data hiding 
	private int id;

	public String getName() {  //  return 
		return name;
	}

	public void setName(String name) {
		this.name = name;
		//this --current class instance varibles 
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
