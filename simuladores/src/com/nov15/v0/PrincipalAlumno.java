package com.nov15.v0;

public class PrincipalAlumno {

	public static void main(String[] args) {

		Alumno alum1 = new Alumno("Filologo",4);
        System.out.println(alum1.nombre); 
        
        Alumno alum2 = alum1.getAlumno();
        
        System.out.println(alum1 == alum2); //true
        
        Alumno alum3 = alum1.getOtroAlumno();
        
        System.out.println(alum1 == alum3); //false
        System.out.println(alum3.nombre);
	}

}
