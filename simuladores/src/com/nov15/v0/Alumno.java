package com.nov15.v0;

public class Alumno {

	String nombre;
	int edad;
	
	public Alumno(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	
	Alumno getAlumno() {
		return this;
	}
	
	Alumno getOtroAlumno() {
		return new Alumno(this.nombre,this.edad);
	}
	
	int comparaEdad(Alumno a) {
		int edad1 = a.edad;
		int edad2 = this.edad;
		return edad1 - edad2;
	}
	
	Object getObject() {
		return (Object)this;
	}
	
}
