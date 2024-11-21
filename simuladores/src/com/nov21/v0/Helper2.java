package com.nov21.v0;

import java.io.FileNotFoundException;

public class Helper2 {

	public static <U extends Exception> void printException(U u) {	
		System.out.println(u.getMessage());
	}
	
	public static void main(String[] args) {
		
		Helper2.printException(new FileNotFoundException("A"));
		Helper2.printException(new Exception("B"));
		Helper2.<NullPointerException>printException(new NullPointerException ("D"));
		
		Helper2.printException(new Throwable("E"));
		
		//Helper2.<Throwable>printException(new Exception("C"));
		
		//Helper2.printException(new StringBuilder("Hello"));
		//Helper2.printException(new Exception("I'm Exception"));
		//Helper2.printException(new Long(20));
		//Helper2.printException(new ClassCastException("I'm Class Cast Exception"));
	}
}
