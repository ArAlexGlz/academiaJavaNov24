package com.curso.v3;

public class Conexion {
	
	static private Conexion conn = new Conexion("mysql");
	
	String name;
	//VARIABLE DE CLASE
	static int contador; //0
	
	private Conexion(String name) {
		this.name = name;
		contador++;
	}
	
	public static Conexion getInstance() {
		return conn;
	}

}
