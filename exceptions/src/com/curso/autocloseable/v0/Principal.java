package com.curso.autocloseable.v0;

public class Principal {

	public static void main(String[] args) {

		Conexion conn = new Conexion("Mysql");
		
		try {
			conn.open();
		} catch (ConexionException e) {
			e.printStackTrace();
		}
		
		System.out.println("FIN DE PROGRAMA");
	}

}
