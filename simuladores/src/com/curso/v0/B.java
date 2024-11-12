package com.curso.v0;

public class B {

	public static void main(String[] args) {
		
		System.out.println("Clase B");
		
		A a = new A();
		
		a.modifyOther(a);
		
		//a.i = 20;
		
	}

//	public void modifyOther(A a1) {
//		a1.i = 20;
//		System.out.println(a1.i);
//	}
}
