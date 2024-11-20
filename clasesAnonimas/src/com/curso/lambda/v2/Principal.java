package com.curso.lambda.v2;

interface Operacion<V>{
	V ejecuta(V v1,V v2);
}

public class Principal {

	public static void main(String[] args) {
		
		System.out.println("Lambda v2");
		
		Operacion<Double> o1 = (x,y) -> x + y;
		
		System.out.println(o1.ejecuta(8.0, 4.0));
		
		Operacion<Integer> o2 = (z,w) -> z - w;
		
		System.out.println(o2.ejecuta(8, 4));
		
		Operacion<Short> o3 = (short1,short2) -> (short)(short1 * short2);
		
		System.out.println(o3.ejecuta((short)8, (short)4));
		
		Operacion<Long> o4 =  (pato1,pato2) -> (long)Math.pow(pato1, pato2);
			
		System.out.println(o4.ejecuta(8L, 4L));
		
		Operacion<String> o5 = (w,q) -> q.concat(w);
		
		System.out.println(o5.ejecuta("Hello","World"));

	}

}
