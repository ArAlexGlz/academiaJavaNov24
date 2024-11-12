package p2;

import p1.*;

public class B extends p1.A{

	public static void main(String[] args) {
		System.out.println("Hello B");
		B b = new B();
		b.i = b.i * 2;
		
	}
	
	public void process(A a) {
		//a.i = a.i * 2;
	}

}
