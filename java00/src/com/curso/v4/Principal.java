package com.curso.v4;

class A {
	public static void sM1() {
		System.out.println("In base static A");
	}
}

class B extends A{ 
	//HIDDEN (OCULTAN)
	public static void sM1() {
		System.out.println("In SubBase static B");
	}
}

public class Principal {

	public static void main(String[] args) {
		
		B.sM1(); //In SubBase static B
		
	}

}
