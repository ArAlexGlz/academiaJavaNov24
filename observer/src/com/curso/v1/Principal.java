package com.curso.v1;

import java.util.*;

public class Principal {
	
	static List<String> nombres = new ArrayList<>();
	
	public static void main(String[] args) {

		String s1 = "Patrobas";
		String s2 = "Epeneto";
		String s3 = "Andronico";
		String s4 = "Filologo";
	
		System.out.println(nombres);
		
		nombres.add(s1);
		nombres.add(s2);
		nombres.add(s3);
		nombres.add(s4);
		
		System.out.println(nombres);
		
		//nombres.remove(s2);
		dettttach(s2);

		System.out.println(nombres);
		
		for (String name : nombres)
			System.out.println("Nombre: "+name);

	}
	
	static void dettttach(String s) {
		nombres.remove(s);
	}

}
