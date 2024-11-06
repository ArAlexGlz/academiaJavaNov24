package com.curso.v0;

public class Principal {
		
	public static void main(String[] args) {
		
		Estaciones est = Estaciones.PRIMAVERA;
		
		System.out.println(est);
		
		switch(est) {
		
		case PRIMAVERA:
			System.out.println("Estación Primavera");
			break;
		case VERANO:
			System.out.println("Estación Verano");
			break;
		case OTONIO:
			System.out.println("Estación Otoño");
			break;
		default:
			System.out.println("Estación Invierno");
		}
		
		//var solo se pueden definir como variables locales
		var name = "Patrobas";
		var age = 8;
		
		
		
		
	}

}
