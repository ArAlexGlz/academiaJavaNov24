package com.curso.v1;

public class Principal {
	
	public static void main(String[] args) {
		
		System.out.println("Contador: "+Pato.contador); //  0

		Pato pato1 = new Pato("Donald");
		Pato pato2 = new Pato("Lucas");
		Pato pato3 = new Pato("Patito Feo");
		Pato pato4 = new Pato("Pato Rico");
		
//		System.out.println("Contador: "+pato1.contador); //  1,1,4
//		System.out.println("Contador: "+pato2.contador); //  2,1,4
//		System.out.println("Contador: "+pato3.contador); //  3,1,4
//		System.out.println("Contador: "+pato4.contador); //  4,1,4
		
		System.out.println("Contador: "+ Pato.contador); //  4
		System.out.println("Contador: "+ Pato.contador); //  4
		System.out.println("Contador: "+ Pato.contador); //  4
		System.out.println("Contador: "+ Pato.contador); //  4
		
		
	}

}
