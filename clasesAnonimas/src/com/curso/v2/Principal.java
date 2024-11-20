package com.curso.v2;

interface Operacion{
	double ejecuta(double x,double y);
}

public class Principal {

	public static void main(String[] args) {
		
		Operacion o1 = new Operacion() {
			@Override
			public double ejecuta(double x, double y) {
				return x + y;
			}
		};
		
		System.out.println(o1.ejecuta(8.0, 4.0));
		
		Operacion o2 = new Operacion() {
			@Override
			public double ejecuta(double x, double y) {
				return x - y;
			}
		};
		
		System.out.println(o2.ejecuta(8.0, 4.0));
		
		Operacion o3 = new Operacion() {
			@Override
			public double ejecuta(double x, double y) {
				return x * y;
			}
		};
		
		System.out.println(o3.ejecuta(8.0, 4.0));
		
		Operacion o4 = new Operacion() {
			@Override
			public double ejecuta(double x, double y) {
				return Math.pow(x, y);
			}
		};
		
		System.out.println(o4.ejecuta(8.0, 4.0));


	}

}
