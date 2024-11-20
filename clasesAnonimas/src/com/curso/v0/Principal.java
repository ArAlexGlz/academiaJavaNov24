package com.curso.v0;

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
		double resultado;
		
		Operacion o1 = new Suma();
		resultado = o1.ejecuta(8.0, 4.0);
		System.out.println("Suma: "+resultado);
		
		Operacion o2 = new Resta();
		resultado = o2.ejecuta(8.0, 4.0);
		System.out.println("Resta: "+resultado);
		
		Operacion o3 = new Multi();
		resultado = o3.ejecuta(8.0, 4.0);
		System.out.println("Multi: "+resultado);
		
		Operacion o4 = new Exp();
		resultado = o4.ejecuta(8.0, 4.0);
		System.out.println("Exp: "+resultado);

	}

}
