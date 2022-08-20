package Abstarction;

public class ChildInterface implements I1,I2{

	public static void main(String[] args) {
		ChildInterface ci=new ChildInterface();
		ci.show();
		ci.run();
		I2.test();

		System.out.println(ci.a);
	
	}

	@Override
	public void show() {
		System.out.println("show");
		
	}

	@Override
	public void run() {
		System.out.println("run");
	}
	}
