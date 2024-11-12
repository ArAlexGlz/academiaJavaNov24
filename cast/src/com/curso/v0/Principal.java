package com.curso.v0;

public class Principal {

	public static void main(String[] args) {

		Object obj1 = new StringBuilder("Hello");
		
		//obj1.append("World"); //NO SE PUEDE
		
		((StringBuilder)obj1).append(" World");
		
		System.out.println(obj1);
	}

}
