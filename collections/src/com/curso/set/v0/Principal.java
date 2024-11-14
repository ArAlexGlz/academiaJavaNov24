package com.curso.set.v0;

import java.util.*;

public class Principal {

	public static void main(String[] args) {
		
		Set<String> setAlumnoString = new HashSet<>();
		setAlumnoString.add(new String("Herodion"));
		setAlumnoString.add(new String("Epeneto"));
		setAlumnoString.add(new String("Herodion"));

		System.out.println("String: "+setAlumnoString); 
		
		Set<StringBuilder> setAlumnoSb = new HashSet<>();
		setAlumnoSb.add(new StringBuilder("Herodion"));
		setAlumnoSb.add(new StringBuilder("Epeneto"));
		setAlumnoSb.add(new StringBuilder("Herodion"));

		System.out.println("StringBuilder: "+setAlumnoSb); 
		
		Set<Alumno> setAlumno = new HashSet<>();
		setAlumno.add(new Alumno("Herodion"));
		setAlumno.add(new Alumno("Epeneto"));
		setAlumno.add(new Alumno("Herodion"));

		System.out.println("Alumno: "+setAlumno); 

	}

}
