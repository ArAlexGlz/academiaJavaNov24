package com.curso.oca.v0;

public abstract class Calculator {
	
	//Métodos sin comportamiento
	abstract void calculate();
	
	public static void main(String[] args) {
		System.out.println("Calculating");
		Calculator x = null;
		x.calculate();
	}

}
