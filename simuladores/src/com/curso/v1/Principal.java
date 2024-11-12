package com.curso.v1;

class A{
	int i = 10;
	void ejecuta() {
		System.out.println("A");
	}
}

class B extends A{
	//HIDDEN
	int i = 1000;
	//@Override
	void ejecuta() {
		System.out.println("B");
	}
}

public class Principal {

	public static void main(String[] args) {
		
		A a = new B();
		System.out.println(a.i); //10
		a.ejecuta();  //B

	}

}
