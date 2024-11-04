package com.curso.v2;

public class Paquete1 {
	
	double peso; //0.0
	Paquete1 paquete; //<== ¡¡ALERT!! //null

	public static void main(String[] args) {

		Paquete1 paq1 = new Paquete1();
		paq1.peso = 5.0;
			
		Paquete1 paq2 = new Paquete1();
		paq2.peso = 10.0;
		
		paq1 = paq2;
		
		paq2.paquete = paq1;
		paq2.paquete.peso = 20.0;
		
		System.out.println(paq1.peso); 
		System.out.println(paq1.paquete.peso);  

		System.out.println(paq2.peso);  
		System.out.println(paq2.paquete.peso);  
		
		
	}

}
