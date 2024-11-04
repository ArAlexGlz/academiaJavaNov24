package com.curso.v0;

public class Principal1 {

	public static void main(String[] args) {
		
		//PRIMITIVOS
		int i1 = 170;
		int i2 = 170;
		
		//System.out.println(i1 == i2); //true
		
		int i3 = 100;
		int i4 = 100;
		
		//System.out.println(i3==i4); //true
		
		Integer integer0 = new Integer(170); //JAVA8
		Integer integer00 = Integer.valueOf(170);
		
	
		//AUTOBOXING & UNBOXING
		Integer integer1 = 200; //Integer.valueOf(170);
		Integer integer2 = 200; //Integer.valueOf(170);
		
		System.out.println(integer1==integer2); //false
		
		Integer integer3 = 100; //Integer.valueOf(100);
		Integer integer4 = 100; //Integer.valueOf(100);
		
		System.out.println(integer3==integer4); //true


	}

}
