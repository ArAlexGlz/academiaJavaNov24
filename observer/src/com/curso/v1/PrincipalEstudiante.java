package com.curso.v1;
import com.curso.v0.Estudiante;

public class PrincipalEstudiante extends Estudiante  {

	public static void main(String[] args) {

		PrincipalEstudiante e1 = new PrincipalEstudiante();
		
		e1.edad = 10;
		
		System.out.println("Edad: "+e1.edad);
		
	}

}