package Test2;

import Test1.Parent;

public class Child {

	public static void main(String[] args) {
		Child child=new Child();
		  System.out.println(Parent.a);
		  //System.out.println(Parent.b);
		  // public 
//        System.out.println(child.b); //  protected 
//        System.out.println(child.c); // private --No
//        System.out.println(child.d); // default --No
	}

}
