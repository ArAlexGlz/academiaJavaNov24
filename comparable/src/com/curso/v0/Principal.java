package com.curso.v0;

import java.util.Arrays;

public class Principal {

	public static void main(String[] args) {

		String[] nombres = {"Patrobas", "aristobulo", "4lazy", "Andronico"};
		
		Arrays.sort(nombres);
		
		System.out.println(Arrays.toString(nombres));
		//4lazy, Andronico, Patrobas, aristobulo
		
	}

}
