package com.curso.v4;

public enum DiaSemana {
	LUNES("Bajo"),
	MARTES("Bajo"),
	MIERCOLES("Medio"),
	JUEVES("Medio"),
	VIERNES("Alto"),
	SABADO("Alto"),
	DOMINGO("Super alto");
	
	private String animo;
	private static int diasSemana = 7;
	
	//private
	DiaSemana(String animo){
		this.animo = animo;
	}
	
	String getAnimo() {
		return animo;
	}
	
	void setAnimo(String animo) {
		this.animo = animo;
	}
	
	static int getDiasSemana() {
		return diasSemana;
	}

	@Override
	public String toString() {
		return name() +" "+ animo;
	}
}
