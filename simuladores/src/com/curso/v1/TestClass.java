package com.curso.v1;

class Book{
	protected final int pages=1000;
	final void mA() {
		System.out.println("In B.mA "+pages);
	}
}
class Encyclopedia extends Book{
	//Hidden
	private int pages = 200; //1
	void mB() {
		System.out.println("In E.mB() " + pages);
		//System.out.println("In E.mB() " + super.pages);
	}
//	void mA() { //2 ERROR COMPILATION
//		System.out.println("In E.mA"+pages);
//	}
}

public class TestClass {

	public static void main(String[] args) {
		Book o1 = new Encyclopedia();
		o1.mA(); //1000
		//o1.mB(); //5 ERROR COMPILATION
		
		Book o2 = new Book();
		o2.mA();
		
		((Encyclopedia)o1).mB(); //In E.mB() 200
	
	
	}

}
