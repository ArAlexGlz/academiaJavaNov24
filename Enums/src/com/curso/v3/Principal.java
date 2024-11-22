package com.curso.v3;

public class Principal {

	public static void main(String[] args) {
		
		DiaSemana dia = DiaSemana.VIERNES;
		
		dia = DiaSemana.DOMINGO;
		
		System.out.println(dia);
		dia.setAnimo("Muy bajo");
		System.out.println(dia.getAnimo());
		
		System.out.println(DiaSemana.diasSemana);
		
		

	}

}
