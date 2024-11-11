package com.curso.v0;

public class A {
	{
		System.out.println("A1 ins");
	}
	
	static {
		System.out.println("A1 static");
	}

	public static void main(String[] args) {
		System.out.println("1"); //A1 static / 1
	}
}

class B extends A{
	{
		System.out.println("B1 ins");
	}
	
	static {
		System.out.println("B1 static");
	}
}