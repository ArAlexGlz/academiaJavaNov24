package com.curso.v1;

public class Principal {

	public static void main(String[] args) {

		String user1 = "Patrobas";
		String user2 = "Epeneto";
		String user3 = "Andronico";
		
		Conexion con1 = new Conexion("mysql");
		Conexion con2 = new Conexion("mysql");
		Conexion con3 = new Conexion("mysql");

		
//		asignarConexion(user1,con1);
//		asignarConexion(user2,con2);
//		asignarConexion(user3,con3);

//		System.out.println(con1.contador); //3
//		System.out.println(con2.contador); //3
//		System.out.println(con3.contador); //3
		
		System.out.println(Conexion.contador);
		
	}
	
	static void asignarConexion(String name, Conexion con) {
		
		System.out.println(name+ ": Asignar Conexion, "+con);
		
	}

}
