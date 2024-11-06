package com.curso.v2;

class Ave{}

class Aguila extends Ave{
	void volarAguila() {
		System.out.println("Volar Aguila");
	}
}

class Pato extends Ave{
	void volarPato() {
		System.out.println("Volar Pato");
	}
}

class Pinguino extends Ave{
	void volarPato() {
		System.out.println("Volar Pinguino");
	}
}

public class Principal {

	public static void main(String[] args) {
		
		Ave ave = getAve(); //Regresando Aguila
		
		if (ave instanceof Aguila)
			((Aguila)ave).volarAguila();

	}

	private static Ave getAve() {
		
		Pato pato = new Pato();
		Aguila aguila = new Aguila();
		Pinguino pinguino = new Pinguino();
		
		return aguila;
	}

}
