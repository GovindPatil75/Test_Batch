package Test1;

public class ParentTest {

	public void display() {
		System.out.println("Parent p");
	}
}
class C1 extends ParentTest{
	
	public void c1() {
		System.out.println("c1");
	}
}
class C2 extends ParentTest{
	
	public void c2() {
		System.out.println("c2");
	}
	
	
}