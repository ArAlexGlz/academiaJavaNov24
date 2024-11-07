package com.curso.v0;

public class Principal {
	
	public static void main(String[] args) {
		
		String s1 = "Hello";
		String s2 = new String("Hello");
		
		System.out.println(s1==s2); //false
		System.out.println(s1.equals(s2)); //true
		
		System.out.println("***StringBuilder***");
		StringBuilder sb1 = new StringBuilder("Hola");
		StringBuilder sb2 = new StringBuilder("Hola");
		
		System.out.println(sb1==sb2); //false
		System.out.println(sb1.equals(sb2)); //false


	}

}
