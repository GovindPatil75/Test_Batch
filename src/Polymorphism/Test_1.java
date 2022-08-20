package Polymorphism;

public class Test_1 {
	
	public void show() {
		System.out.println("test-show 1");
	}
	public void show(int a) {
		
		System.out.println("test-show 2");
	}
	
	public static void main(String[] args) {
		
		Test_1 t=new Test_1();
		t.show();
		t.show(1);
	}

}
