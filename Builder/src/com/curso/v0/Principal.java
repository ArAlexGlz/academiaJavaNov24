package com.curso.v0;


public class Principal {

	public static void main(String[] args) {

		Casa casa = new Casa.Builder()
				.tipoTecho("Tejas") 
				.numVentanas(8)
				.colorParedes("Blanco")
				.build();
		
//		Casa.Builder armador = new Casa.Builder();
//		armador = armador.numVentanas(8);
//		armador = armador.colorParedes("Blanco");
//		armador = armador.tipoTecho("Tejas");
//		Casa casa = armador.build();
//		
		
	}
}
