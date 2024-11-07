package com.curso.v3;

public class Principal {

	public static void main(String[] args) {

		String user1 = "Patrobas";
		String user2 = "Epeneto";
		String user3 = "Andronico";
		
		Conexion con1 = Conexion.getInstance();
		
		System.out.println(con1); 
		
		if (con1!=null)
			System.out.println(con1.name); //mysql
		
	}
	
	static void asignarConexion(String name, Conexion con) {
		
		System.out.println(name+ ": Asignar Conexion, "+con);
		
	}

}
