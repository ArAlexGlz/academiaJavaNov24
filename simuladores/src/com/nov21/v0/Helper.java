package com.nov21.v0;

public class Helper {

	public static <U> void printException(U u) {	
		System.out.println(u);
	}
	
	public static void main(String[] args) {
		Helper.printException(new StringBuilder("Hello"));
		Helper.printException(new Exception());
		Helper.printException(new Long(20));
		Helper.printException(new ClassCastException());
	}
}
