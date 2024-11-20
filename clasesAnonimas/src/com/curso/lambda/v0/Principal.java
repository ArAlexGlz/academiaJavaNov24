package com.curso.lambda.v0;

interface Operacion{
	double ejecuta(double x,double y);
}

public class Principal {

	public static void main(String[] args) {
		
		System.out.println("Lambda v0");
		
		Operacion o1 = (x ,y) -> x + y;
		
		System.out.println(o1.ejecuta(8.0, 4.0));
		
		Operacion o2 = (x ,y) -> x - y;
		
		System.out.println(o2.ejecuta(8.0, 4.0));
		
		Operacion o3 = (x ,y) -> x * y;
		
		System.out.println(o3.ejecuta(8.0, 4.0));
		
		Operacion o4 =  (x ,y) -> Math.pow(x, y);
			
		System.out.println(o4.ejecuta(8.0, 4.0));

	}

}
