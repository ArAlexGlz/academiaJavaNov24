package com.curso.lambda.v1;

interface Operacion{
	double ejecuta(double x,double y);
}

public class Principal {

	public static void main(String[] args) {
		
		System.out.println("Lambda v1");
		
		Operacion o1 = (x,y) -> x + y;
		
		System.out.println(o1.ejecuta(8.0, 4.0));
		
		Operacion o2 = (z,w) -> z - w;
		
		System.out.println(o2.ejecuta(8.0, 4.0));
		
		Operacion o3 = (double1,double2) -> double1 * double2;
		
		System.out.println(o3.ejecuta(8.0, 4.0));
		
		Operacion o4 =  (pato1,pato2) -> Math.pow(pato1, pato2);
			
		System.out.println(o4.ejecuta(8.0, 4.0));

	}

}
