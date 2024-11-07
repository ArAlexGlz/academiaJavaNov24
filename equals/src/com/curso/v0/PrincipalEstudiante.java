package com.curso.v0;

import java.time.LocalDate;

public class PrincipalEstudiante {

	public static void main(String[] args) {

		Estudiante e1 = new Estudiante("Patrobas",19,LocalDate.of(2024, 12, 1));
		Estudiante e2 = new Estudiante("Patrobas",19,LocalDate.of(2020, 1, 1));
		
		System.out.println(e1.equals(e2)); //true
	}

}
