package com.curso.v3;

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
	void volarPinguino() {
		System.out.println("Volar Pinguino");
	}
}

public class Principal {

	public static void main(String[] args) {
		
		Ave ave = getAve(); //Regresando Aguila
		
		if (ave instanceof Aguila)
			((Aguila)ave).volarAguila();
		
		if (ave instanceof Pato)
			((Pato)ave).volarPato();
		
		if (ave instanceof Pinguino)
			((Pinguino)ave).volarPinguino();

	}

	private static Ave getAve() {
		
		Pato pato = new Pato();
		Aguila aguila = new Aguila();
		Pinguino pinguino = new Pinguino();
		
		return pato;
	}

}
