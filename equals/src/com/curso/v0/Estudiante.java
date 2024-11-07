package com.curso.v0;

import java.time.LocalDate;
import java.util.Objects;

public class Estudiante{
	
	private String nombre;
	private int edad;
	private LocalDate fechaInscripcion;
	
	public Estudiante(String nombre, int edad, LocalDate fechaInscripcion) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.fechaInscripcion = fechaInscripcion;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(edad, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Estudiante other = (Estudiante) obj;
		return edad == other.edad && Objects.equals(nombre, other.nombre);
	}



	@Override
	public String toString() {
		return "Estudiante [nombre=" + nombre + ", edad=" + edad + ", fechaInscripcion=" + fechaInscripcion + "]";
	}
	
//	@Override
//	public boolean equals(Object obj) {
//		
//		Estudiante est = (Estudiante)obj;
//		
//		if (nombre == est.nombre && edad == est.edad)
//			return true;
//		
//		return false;
//	
//	}

	
	

}
