package com.nov15.v0;

public class Principal {

	public static void main(String[] args) {

		Alumno alum1 = new Alumno("Filologo",4);
		
		int r = alum1.comparaEdad(new Alumno("Patrobas",9));
		
		System.out.println(r);
	}

}
