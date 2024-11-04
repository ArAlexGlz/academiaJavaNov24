package com.curso.v0;

public class Principal2 {

	public static void main(String[] args) {

		String s = "Hello";
		StringBuilder sb = new StringBuilder("Hola");
		int i = 100;
	
		ejecuta(s,sb,i);
			
		System.out.println(s); // Hello World //Hello
		System.out.println(sb); // Hola Mundo //Hola Mundo
		System.out.println(i); // 200 //100
	}
	
	static void ejecuta(String s,StringBuilder sb, int i){
		i = i+100;
		sb = sb.append(" Mundo");
		s = s.concat( " World");
	}

}
