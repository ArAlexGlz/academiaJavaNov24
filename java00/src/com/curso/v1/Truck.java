package com.curso.v1;

class Automobile {
	public void drive() {
		System.out.println("Automobile: drive");
	}
}

public class Truck extends Automobile {

	@Override
	public void drive() {
		System.out.println("Truck: drive");
	}

	public static void main(String[] args) {
		
		Automobile a0 = new Truck();
		
		a0.drive(); //Truck: drive
		
		Automobile a1 = new TruckManual();
		
		a1.drive(); //Truck Manual: drive
		
		
	}
}

class TruckManual extends Truck {
	
	@Override
	public void drive() {
		System.out.println("Truck Manual: drive");
	}
	
}

	
