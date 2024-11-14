package com.curso.set.v2;

import java.util.Objects;

public class Alumno implements Comparable<Alumno> {
	
	private String nombre;
	private int edad;

	public Alumno(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
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
		Alumno other = (Alumno) obj;
		return edad == other.edad && Objects.equals(nombre, other.nombre);
	}

	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", edad=" + edad + "]";
	}

	@Override
	public int compareTo(Alumno o) {
		if (this.edad > o.edad)
			return 55;
		else if (this.edad < o.edad)
			return -11;
		else
			return 0;
		
	}
	
}
