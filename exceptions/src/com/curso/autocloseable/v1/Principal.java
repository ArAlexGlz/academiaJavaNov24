package com.curso.autocloseable.v1;

public class Principal {

	public static void main(String[] args) {

		System.out.println("V1");
		
		Conexion conn = new Conexion("Mysql");
		
		try {
			conn.open();
		} catch (ConexionException e) {
			e.printStackTrace();
		} finally {
			conn.close();
		}
		
		System.out.println("FIN DE PROGRAMA");
	}

}
