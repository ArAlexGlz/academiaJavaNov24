package com.dic04.v0;

public class StaticTest {

	static {
		System.out.println("In static");
	}

	StaticTest(){
		System.out.println("Constructor");
	}

	public static void main(String args[ ])    {  
		System.out.println("Hola Mundo");
		new StaticTest();
	}
	
	//In static
	//Hola Mundo
	//In non - static
	//Constructor
	
	{
		System.out.println("In non - static");
	}
	
	
}
