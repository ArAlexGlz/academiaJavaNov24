package com.curso.v4;

public class Conexion {
	
	static private Conexion conn;
	
	String name;
	//VARIABLE DE CLASE
	static int contador; //0
	
	private Conexion(String name) {
		this.name = name;
		contador++;
	}
	
	public static Conexion getInstance() {
		if (conn == null)
			conn = new Conexion("mysql");
		return conn;
	}
	
	@Override
	public String toString() {
		return "Conexion: "+name;
	}

}
