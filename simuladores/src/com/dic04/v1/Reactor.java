package com.dic04.v1;

class Boiler {
	static void shutdown() { 
		System.out.println("shutting down");
	}
}

class Vaporizer extends Boiler {
	void vaporize() {
		System.out.println("Vaporized!");
	}
}

public class Reactor extends Vaporizer  {
	
	public static void main(String[] args) {
		System.out.println("V1");
		Vaporizer v =  new Reactor();
		v.shutdown(); 
		
	}

}
