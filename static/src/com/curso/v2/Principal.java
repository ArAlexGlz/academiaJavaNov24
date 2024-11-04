package com.curso.v2;

public class Principal {
	
	public static void main(String[] args) {
		
		System.out.println("V2");
		
		System.out.println("Contador: "+Pato.getContador()); //  0

		Pato pato1 = new Pato("Donald");
		Pato pato2 = new Pato("Lucas");
		Pato pato3 = new Pato("Patito Feo");
		Pato pato4 = new Pato("Pato Rico");
		
		System.out.println("Contador: "+ Pato.getContador()); //  4
		
		
	}

}
