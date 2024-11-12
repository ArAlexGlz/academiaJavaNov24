package com.curso.v3;

class A{
	public A() {
		super();
		System.out.println("A()");
	} //A1 //4
	public A(String s) { //A2
		this();
		System.out.println("A: "+s); 
	}
}
class B extends A{
//	B(){super();} //3
	public int B(String s) { //B1
		System.out.println("B: "+s); 	
		return 0;
	}
}
class C extends B{
	private C() { //2
		super();
		System.out.println("C()");

	}
	public C(String s) {
		this(); //1
		System.out.println("C: "+s); 
	}
	public C(int i) {
		//super();
	}
}

public class Principal {

	public static void main(String[] args) {
		new C("Hello");
		//A()
		//C()
		//C: Hello
	}

}
