package com.dic04.v1;

public class StaticTest {

	static {
		System.out.println("In static");
	}

	StaticTest(){
		System.out.println("Constructor");
	}

	public static void main(String args[ ])    { 
		new StaticTest();
		System.out.println("Hola Mundo");
		new StaticTest();
	}
	
	//In static
	//In non - static
	//Constructor
	//Hola Mundo
	//In non - static
	//Constructor
	
	{
		System.out.println("In non - static");
	}
	
}
