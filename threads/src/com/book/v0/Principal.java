package com.book.v0;

public class Principal {

	public static void main(String[] args) {
		
		new Thread( () -> System.out.print("Hello") ).start(); 
		
		System.out.print("World");

	}

}
