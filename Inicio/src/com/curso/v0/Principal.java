package com.curso.v0;

public class Principal {

	public static void main(String[] args) {
		
		String s1 = "Hello";
		
		s1.concat(" World"); //String **INMUTABLE**
		
		System.out.println("s1: "+s1); //Hello
		
		StringBuilder sb1 = new StringBuilder("Hello");
		//StringBuilder **MUTABLE**
		sb1.append(" World");
		
		System.out.println("sb1: "+sb1); //Hello World
		
		System.out.println("*****************");
		
		String s2 = new String("Hola");
		String s3 = new String("Hola");
		System.out.println(s2 == s3); //false
		// == LAS REFERECIAS NO APUNTAN AL MISMO ABJETO
		
		String s4 = "Hola";
		String s5 = "Hola";
		System.out.println(s4 == s5); //true
		// == LAS REFERECIAS SI APUNTAN AL MISMO ABJETO
		
		StringBuilder sb2 = new StringBuilder("Hola");
		StringBuilder sb3 = new StringBuilder("Hola");
		System.out.println(sb2 == sb3);//false
		// == LAS REFERECIAS NO APUNTAN AL MISMO ABJETO

	}

}
