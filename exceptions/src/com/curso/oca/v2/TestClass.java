package com.curso.oca.v2;

class MyException extends Exception{}

public class TestClass {
	
//	public void myMethod() throws MyException {
//		throw new MyException();
//	}
	
//	public void myMethod() throws Exception {
//		throw new MyException();
//	}
	
	public void myMethod() throws Throwable {
		throw new MyException();
	}

	//	 NO SE PUEDE
//	public void myMethod() throws Object {
//		throw new MyException();
//	}

}
