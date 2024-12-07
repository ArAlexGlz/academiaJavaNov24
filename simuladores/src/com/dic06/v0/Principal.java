package com.dic06.v0;

public class Principal {

	public static void main(String[] args) {

		IntPair ip = new IntPair();
		
		System.out.println( ip.equals(null) );

		ip.setA(5);
		ip.setB(100);
		
		System.out.println("a: "+ip.getA()); //5
		
		System.out.println("a: "+ip.getB(0)); //0
		
		
		Object x = new Object();
		System.out.println( x.equals(null) );
		
	}

}
