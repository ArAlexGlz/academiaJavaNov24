package com.curso.v2;

public class Paquete {
	
	double peso; //0.0
	Paquete paquete; //<== ¡¡ALERT!! //null

	public static void main(String[] args) {

		Paquete paq1 = new Paquete();
		paq1.peso = 5.0;
		
//		System.out.println(paq1.peso);
//		System.out.println(paq1.paquete);
		
		Paquete paq2 = new Paquete();
		paq2.peso = 10.0;
		
		paq2.paquete = paq1;
		paq2.paquete.peso = 20.0;
//		
		System.out.println(paq1.peso);  //20.0
		
		paq2.paquete = null;
		
		//paq1 = null;
		
	}

}
