package com.curso.docto.v0;

import java.io.IOException;

public class Y2 {

	public static void main(String[] args) throws IOException {
		try {
			doSomething();
		} catch (RuntimeException e) {
			System.out.println(e);
		} 
		System.out.println("END PROGRAM");
	}

	static void doSomething() throws IOException {
		if (Math.random() > 0.5) {
			throw new IOException();
		}
		throw new RuntimeException();
	}

}
