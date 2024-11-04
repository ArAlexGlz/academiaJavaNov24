package com.curso.v3;

class A {
	public static void sM1() {
		System.out.println("In base static");
	}
}

class B extends A{  
	//Line 1 --> 
	//public static void sM1() {  System.out.println("In sub static"); }  
	//Line 2 --> 
	//public  void sM1() {  System.out.println("In sub non-static"); }  }
}

public class Principal {

	public static void main(String[] args) {

//		A a = new A();
//		a.sM1();
		
		A.sM1();
		
	}

}
