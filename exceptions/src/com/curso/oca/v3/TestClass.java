package com.curso.oca.v3;

class MyException extends Exception{
	MyException(String msg){
		super(msg);
	}
}

public class TestClass {
	
	public static void main(String[] args) {
		
		try {
			doTest();
		} catch (MyException me) {
			System.out.println(me);
		}
		
		System.out.println("FIN DE PROGRAMA");
		
	}
	
	static void doTest() throws MyException {
		int[] array = new int[10];
		array[10] = 1000;
		doAnotherTest();
	}
	
	static void doAnotherTest() throws MyException {
		throw new MyException
				("Exception from doAnotherTest");
	}
	
}
