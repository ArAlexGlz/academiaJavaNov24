package com.curso.v0;

import java.util.*;

public class Principal3 {

	public static void main(String[] args) {
		
		Alumno alum1 = new Alumno("Patrobas");
		Alumno alum2 = new Alumno("Filologo");
		Alumno alum3 = new Alumno("Patrobas");

		Collection<Alumno> alumnos = new ArrayList<>();

		alumnos.add(alum1);
		alumnos.add(alum2);
		alumnos.add(alum3);
		System.out.println(alumnos); 
		
		System.out.println(
				alumnos.remove(alum3));
		
		System.out.println(alumnos); 

		
	}

}
