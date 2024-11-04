package com.curso.v0;

class Automobile {
	public void drive() {
		System.out.println("Automobile: drive");
	}
}

public class Truck extends Automobile {

	public void drive() {
		System.out.println("Truck: drive");
	}

	public static void main(String[] args) {
		Automobile a = new Automobile();
		Truck t = new Truck();
		a.drive(); //1 //Automobile: drive
		t.drive(); //2 //Truck: drive
		
		a = t;     //3 
		a.drive(); //4 //Truck: drive
	}
}
