package com.curso.v4;

public class Principal {

	public static void main(String[] args) {
		
		DiaSemana dia = DiaSemana.VIERNES;
		
		dia = DiaSemana.DOMINGO;
		
		System.out.println(dia);
		dia.setAnimo("Muy bajo");
		System.out.println(dia.getAnimo());
		
		System.out.println(DiaSemana.getDiasSemana());
		
		System.out.println("********");
		
		DiaSemana[] array = DiaSemana.values();
		
		for (DiaSemana d: array) {
			System.out.println(d.ordinal()+" "+d);
		}
		
		System.out.println("********");

		DiaSemana otherDay = DiaSemana.valueOf("VIERNES");
		
		System.out.println(otherDay.ordinal());

	}

}
