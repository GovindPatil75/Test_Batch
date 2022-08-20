package com.demo;

public class AccessModifier {
    
	// non static ---->
	  public int a=10;   // access -within class
	  protected int b=20;  // within class
	  private int c=30;  // within class
	           int d=40; // within class
	
	public static void main(String[] args) {
		AccessModifier am=new AccessModifier();
		System.out.println(am.a);
		System.out.println(am.b);
		System.out.println(am.c);
		System.out.println(am.d);
		
		TestDemo test=new TestDemo();
		System.out.println(test.p); 
		System.out.println(test.q);
		//System.out.println(test.z); // 
		System.out.println(test.x); 
	}
}
class TestDemo{
	
	//
	public int p=1;
	protected int q=2;
	private int z=3;
	int x=4;
	

}