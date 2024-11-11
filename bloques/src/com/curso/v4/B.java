package com.curso.v4;

class A {
	{
		System.out.println("A1 ins");
	}
	
	static {
		System.out.println("A1 static");
	}
	
	A(){
		System.out.println("ConstructorA");
	}
}

public class B extends A{
	
	B(){
		System.out.println("ConstructorB");
	}
	
	{
		System.out.println("B1 ins");
	}
	
	//A1 static //B1 static 
	public static void main(String[] args) {
		System.out.println("1"); //1 
		new B(); //A1 ins //ConstructorA
		         //B1 ins //ConstructorB
		System.out.println("************");
		new B(); //A1 ins //ConstructorA
        		 //B1 ins //ConstructorB
	}
	
	static {
		System.out.println("B1 static");
	}
}