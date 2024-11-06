package com.curso.v1;

class Ave{}

class Aguila extends Ave{
	void volarAguila() {
		System.out.println("Volar Aguila");
	}
}

public class Principal {

	public static void main(String[] args) {
		
		Aguila aguila = new Aguila();
		aguila.volarAguila();
		
		Ave ave = new Aguila();
		//ave.volarAguila();

	}

}
