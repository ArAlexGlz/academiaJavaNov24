package com.curso.set.v0;

import java.util.Objects;

public class Alumno {
	
	private String nombre;

	public Alumno(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alumno other = (Alumno) obj;
		return Objects.equals(nombre, other.nombre);
	}


	
	
}
