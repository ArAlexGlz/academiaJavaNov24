package com.curso.actual.v1;

interface Z{}

public class X implements Z {
	
	String nombre = "X";
	
	@Override
	public String toString() {
		return "X";
	}
	
	public static void main(String[] args) {
		Y myY = new Y();
		X myX = myY;
		Z myZ = myX;
		
		System.out.println(myY.nombre); //Y
		System.out.println(((X)myY).nombre); //X
		System.out.println(myX.nombre); //X
		System.out.println(((Y)myX).nombre); //Y
		System.out.println(((X)myZ).nombre); //X
	}
	
}

class Y extends X{
	String nombre = "Y";
	@Override
	public String toString() {
		return "Y";
	}
}

