package com.curso.v0;

class A {}
class B extends A{}
class C extends B{}

public class Principal1 {
	
	public static void main(String[] args) {
		
		C c = new C();
		B b = new C();
		A a = new C();
		Object o = new C();
		
		//C cc = (C)new B(); //ClassCastException
		
	}

}
