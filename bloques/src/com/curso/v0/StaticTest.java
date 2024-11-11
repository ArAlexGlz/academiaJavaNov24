package com.curso.v0;

//Carefully examine the following code.  
public class StaticTest {
	
	static {
		System.out.println("In static"); //1
	}
	
	{
		System.out.println("In non - static"); //3 //5
	}

	public static void main(String args[]) {
		StaticTest st1; 
		System.out.println(" 1 "); //2
		st1 = new StaticTest(); 
		System.out.println(" 2 "); //4
		StaticTest st2 = new StaticTest(); 
	}   // In static / 1 / In non - static / 2 / In non - static
}

//What will be the output?
