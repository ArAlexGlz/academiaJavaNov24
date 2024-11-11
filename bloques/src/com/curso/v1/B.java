package com.curso.v1;

class A {
	{
		System.out.println("A1 ins");
	}
	
	static {
		System.out.println("A1 static");
	}
}

public class B extends A{
	
	{
		System.out.println("B1 ins");
	}
	
	public static void main(String[] args) {
		System.out.println("1"); //A1 static //B1 static //1
	}
	
	static {
		System.out.println("B1 static");
	}
}