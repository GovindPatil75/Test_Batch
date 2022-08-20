package Test1;

class Parent_1 {

	public void m3() {
		System.out.println("Parent 1");
	}

}
class Child_1 extends Parent_1{
	
	//m1 ,m3
	public void m1() {
		System.out.println("child 1");
	}
	
}
class Child_2 extends Child_1{
	
	//m2
	//m1 ,m3
	public void m2() {
		System.out.println("child 2");
	}
	
}

