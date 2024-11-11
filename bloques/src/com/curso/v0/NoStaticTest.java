package com.curso.v0;

public class NoStaticTest {

	public static void main(String[] args) {
		System.out.println("Hello");
		new NoStaticTest().process("World");
	}
	
	void process(String cadena) {
		System.out.println(cadena);
	}

}
