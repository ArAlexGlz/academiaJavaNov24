package com.curso.set.v2;

import java.util.*;

public class Principal {

	public static void main(String[] args) {
		
		Set<Alumno> setAlumno = new TreeSet<>();
		setAlumno.add(new Alumno("Herodion",12));
		setAlumno.add(new Alumno("Epeneto",14));
		setAlumno.add(new Alumno("Aristobulo",13));
		setAlumno.add(new Alumno("Andronico",11));
		setAlumno.add(new Alumno("Herodion",12));

		System.out.println("Alumno: "+setAlumno); 

	}

}
