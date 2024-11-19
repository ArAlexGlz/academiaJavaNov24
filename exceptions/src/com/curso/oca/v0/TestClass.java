package com.curso.oca.v0;

class SomeThrowable extends Throwable{}
class MyThrowable extends SomeThrowable{}

public class TestClass {
	
	public static void main(String[] args) throws SomeThrowable{
		System.out.println("V0");
		
		try {
			m1();
		} catch (SomeThrowable e) {
			throw e;
		} finally {
			System.out.println("Done");
		}
		
		System.out.println("FIN DE PROGRAMA");
		
	}
	
	public static void m1() throws MyThrowable  {
		throw new MyThrowable();
	}

}
