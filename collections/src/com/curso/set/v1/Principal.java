package com.curso.set.v1;

import java.util.*;

public class Principal {

	public static void main(String[] args) {
		
		Set<String> setAlumnoString = new TreeSet<>();
		setAlumnoString.add(new String("Herodion"));
		setAlumnoString.add(new String("Epeneto"));
		setAlumnoString.add(new String("Andronico"));
		setAlumnoString.add(new String("Herodion"));
		setAlumnoString.add(new String("Aristobulo"));

		System.out.println("String: "+setAlumnoString); 
		
		Set<StringBuilder> setAlumnoSb = new TreeSet<>();
		setAlumnoSb.add(new StringBuilder("Herodion"));
		setAlumnoSb.add(new StringBuilder("Epeneto"));
		setAlumnoSb.add(new StringBuilder("Andronico"));
		setAlumnoSb.add(new StringBuilder("Aristobulo"));
		setAlumnoSb.add(new StringBuilder("Herodion"));

		System.out.println("StringBuilder: "+setAlumnoSb); 
		
		Set<Alumno> setAlumno = new TreeSet<>();
		setAlumno.add(new Alumno("Herodion"));
		setAlumno.add(new Alumno("Epeneto"));
		setAlumno.add(new Alumno("Aristobulo"));
		setAlumno.add(new Alumno("Andronico"));
		setAlumno.add(new Alumno("Herodion"));

		System.out.println("Alumno: "+setAlumno); 

	}

}
