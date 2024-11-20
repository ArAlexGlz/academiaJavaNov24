package com.curso.v1;

import java.util.Arrays;

public class Principal {

	public static void main(String[] args) {

		Estudiante[] estudiantes = {
				new Estudiante("Patrobas",20,8.9), 
				new Estudiante("Aristobulo", 17, 9.5),
				new Estudiante("Epeneto", 23, 7.5),
				new Estudiante("Andronico",21, 8.0)};
		
		Arrays.sort(estudiantes);
		
		for(Estudiante e : estudiantes)
			System.out.println(e);
		
		//System.out.println(Arrays.toString(estudiantes));
		
		
	}

}
