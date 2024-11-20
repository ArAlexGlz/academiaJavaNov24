package com.curso.v5;

interface Operacion<T>{
	T ejecuta(T t1,T t2);
}

class Suma implements Operacion<Double>{
	@Override
	public Double ejecuta(Double d1, Double d2) {
		return d1+d2;
	}
}

class Resta implements Operacion<Double>{

	@Override
	public Double ejecuta(Double d1, Double d2) {
		return d1-d2;
	}
	
}

class Multi implements Operacion<Integer>{
	@Override
	public Integer ejecuta(Integer x, Integer y) {
		return x*y;
	}
}

class Exp implements Operacion<Short>{
	@Override
	public Short ejecuta(Short x, Short y) {
		return (short)(Math.pow(x, y));
	}
}

public class Principal {

	public static void main(String[] args) {
		
		System.out.println("V5");
		double resultado;
		
		Operacion<Double> o1 = new Suma();
		resultado = o1.ejecuta(8.0, 4.0);
		System.out.println("Suma: "+resultado);
		
		Operacion<Double> o2 = new Resta();
		resultado = o2.ejecuta(8.0, 4.0);
		System.out.println("Resta: "+resultado);
		
		Operacion<Integer> o3 = new Multi();
		resultado = o3.ejecuta(8, 4);
		System.out.println("Multi: "+resultado);
		
		Operacion<Short> o4 = new Exp();
		resultado = o4.ejecuta((short)2, (short)4);
		System.out.println("Exp: "+resultado);

	}

}
