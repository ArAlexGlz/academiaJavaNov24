package com.curso.v4;

import java.util.Random;

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
		
		System.out.println("V4");
		
		Ave ave = getAve(); 
		
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
		
		Ave[] aves = {pato,aguila,pinguino};
		
		int i = new Random().nextInt(aves.length);
		//0,1,2
		
		return aves[i];
	}

}
