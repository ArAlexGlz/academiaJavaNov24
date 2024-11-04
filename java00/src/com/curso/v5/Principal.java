package com.curso.v5;

class A {
	public static void sM1() {
		System.out.println("In base static");
	}
}

class B extends A {
	// Line 1 -->
	public static void sM1() {
		System.out.println("In sub static");
	}
	// Line 2 -->
//	public void sM1() { 
//		System.out.println("In sub non-static"); 
//	} 
}

public class Principal {
	
	String name; //Default

	public static void main(String[] args) {

	}

}
