package com.curso.autocloseable.v2;

public class Principal {

	public static void main(String[] args) {

		System.out.println("V2");
		
		try (Conexion conn = new Conexion("Mysql")) {
			//conn = null; //NO SE PUEDE
			conn.open();
		} catch (ConexionException e) {
			e.printStackTrace();
		} 
		
		System.out.println("FIN DE PROGRAMA");
	}

}
