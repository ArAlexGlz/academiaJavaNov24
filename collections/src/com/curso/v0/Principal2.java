package com.curso.v0;

import java.util.*;

public class Principal2 {

	public static void main(String[] args) {

		Collection<String> alumnos = new ArrayList<>();

		alumnos.add(new String("Patrobas"));
		alumnos.add(new String("Filologo"));
		alumnos.add(new String("Patrobas"));
		
		System.out.println(
				alumnos.remove(new String("Patrobas"))); //true
		
		System.out.println(alumnos); //Patrobas, Filologo
		
		System.out.println("*******************");
		
		Collection<StringBuilder> alumnosSb = new ArrayList<>();

		alumnosSb.add(new StringBuilder("Patrobas"));
		alumnosSb.add(new StringBuilder("Filologo"));
		alumnosSb.add(new StringBuilder("Patrobas"));
		
		System.out.println(
				alumnos.remove(new StringBuilder("Patrobas"))); //false
		
		System.out.println(alumnosSb); //Patrobas, Filologo, Patrobas

		
	}

}
