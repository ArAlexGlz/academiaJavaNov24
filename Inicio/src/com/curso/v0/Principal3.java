package com.curso.v0;

public class Principal3 {

	public static void main(String[] args) {

		String s = "Hello";
		StringBuilder sb = new StringBuilder("Hola");
		int i = 100;
	
		s = ejecuta(s,sb,i);
			
		System.out.println(s); //Hello World
		System.out.println(sb); //Hola Mundo
		System.out.println(i); //100
	}
	
	static String ejecuta(String s,StringBuilder sb, int i){
		i = i+100;
		sb = sb.append(" Mundo");
		return s.concat(" World");
		
	}

}
