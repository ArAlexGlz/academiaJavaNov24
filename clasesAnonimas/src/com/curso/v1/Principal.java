package com.curso.v1;

import java.util.*;

interface Operacion{
	double ejecuta(double x,double y);
}

class Suma implements Operacion{
	@Override
	public double ejecuta(double x, double y) {
		return x+y;
	}
}

class Resta implements Operacion{
	@Override
	public double ejecuta(double x, double y) {
		return x-y;
	}
}

class Multi implements Operacion{
	@Override
	public double ejecuta(double x, double y) {
		return x*y;
	}
}

class Exp implements Operacion{
	@Override
	public double ejecuta(double x, double y) {
		return Math.pow(x, y);
	}
}

public class Principal {

	public static void main(String[] args) {
		
		List<Operacion> lista = new ArrayList<>();
		lista.add(new Suma());
		lista.add(new Resta());
		lista.add(new Multi());
		lista.add(new Exp());
		
		show(lista);

	}
	
	static void show(List<Operacion> lista) {
		for (Operacion o:lista) {
			//Polimorfismo
			System.out.println(o.getClass().getSimpleName());
			System.out.println(o.ejecuta(8.0, 4.0));
		}
	}

}
