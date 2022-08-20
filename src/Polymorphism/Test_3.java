package Polymorphism;

public class Test_3  extends Test_2{
	
	//public >protected>default>private
	
	 public String run() {
		System.out.println("Run -Child");
		return null;
	}
	public static void dispaly() {
		System.out.println("Parent -Child");
	}

	public static void main(String[] args) {
		Test_3 t3=new Test_3();
		//t3.eat();
	//	t3.show();
		t3.run(); // 
//        dispaly();
//		  
//        Test_2.dispaly();
//        Test_3.dispaly();
		
	}

}
