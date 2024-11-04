package com.curso.v0;

public class Principal {
	
	public static void main(String[] args) {
		
		Pato pato1 = new Pato("Donald");
		Pato pato2 = new Pato("Lucas");
		Pato pato3 = new Pato("Patito Feo");
		Pato pato4 = new Pato("Pato Rico");
		
		System.out.println("Contador: "+pato1.contador); //  1
		System.out.println("Contador: "+pato2.contador); //  1
		System.out.println("Contador: "+pato3.contador); //  1
		System.out.println("Contador: "+pato4.contador); //  1
		
		System.out.println(pato2.nombre); 
		System.out.println(pato4.nombre); 
		
	}

}
