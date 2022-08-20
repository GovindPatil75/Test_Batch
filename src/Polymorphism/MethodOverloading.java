package Polymorphism;

public class MethodOverloading {
	
	// same class
	// name of method is same
	// argument diff ----> no of argument diffrent 
	                      //type of argument diff
	                      //sequnec of argument diffrent 
	
	public void test(String name,int a) {
		System.out.println("test ");
	}
	public void test(int a,String name) {
		System.out.println("test -argument");
	}

	public static void main(String[] args) {
		
		MethodOverloading load=new MethodOverloading();
		load.test("bug",10);
		load.test(10,"bug");
		main();
		main(30);
	}
	
	public static void main() {
		System.out.println("main -zero");
	}
	public static void main(int c) {
		System.out.println("test-one");
	}
	
	
	
	
	

}
