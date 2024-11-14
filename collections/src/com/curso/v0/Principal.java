package com.curso.v0;

import java.util.*;

public class Principal {

	public static void main(String[] args) {

		Collection<Alumno> alumnos = new ArrayList<>();

		alumnos.add(new Alumno("Patrobas"));
		alumnos.add(new Alumno("Filologo"));
		alumnos.add(new Alumno("Patrobas"));
		
		System.out.println(
				alumnos.remove(new Alumno("Patrobas")));
		
		System.out.println(alumnos); 
		
		System.out.println(alumnos.contains(new Alumno("Filologo"))); //true

		
	}

}
