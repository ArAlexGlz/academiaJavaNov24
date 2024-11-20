package com.curso.actual.v0;

interface Z{}

public class X implements Z {
	
	public String toString() {
		return "X";
	}
	
	public static void main(String[] args) {
		Y myY = new Y();
		X myX = myY;
		Z myZ = myX;
		
		//System.out.println(myX.toString());
		System.out.println(myX); //Y
		System.out.println((Y)myX); //Y
		//System.out.println((Z)myX); //Y
		System.out.println(myZ); //Y
	}
	
}

class Y extends X{
	public String toString() {
		return "Y";
	}
}

