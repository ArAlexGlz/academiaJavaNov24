package com.curso.v4;

public class Principal {

	public static void main(String[] args) {

		String user1 = "Patrobas";
		String user2 = "Epeneto";
		String user3 = "Andronico";
		
		Conexion con1 = Conexion.getInstance();
		Conexion con2 = Conexion.getInstance();
		Conexion con3 = Conexion.getInstance();
		
		Conexion con999 = Conexion.getInstance();
	
		asignarConexion(user1,con1);
		asignarConexion(user2,con2);
		asignarConexion(user3,con3);
		
		System.out.println("# Conexiones:"+Conexion.contador); //1
		
	}
	
	static void asignarConexion(String name, Conexion con) {
		
		System.out.println(name+ ": Asignar Conexion, "+con);
		
	}

}
