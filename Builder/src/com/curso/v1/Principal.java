package com.curso.v1;

public class Principal {

	public static void main(String[] args) {
		
		Casa.Builder build = new Casa().new Builder();
		
		System.out.println(build);
	}
}
