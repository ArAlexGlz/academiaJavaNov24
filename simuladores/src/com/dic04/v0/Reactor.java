package com.dic04.v0;

interface Boiler {
	void boil(); // public abstract

	static void shutdown() { // public
		System.out.println("shutting down");
	}
}

interface Vaporizer extends Boiler {
	
	default void vaporize() { //public
		boil();
		System.out.println("Vaporized!");
	}
}

public class Reactor implements Vaporizer  {

	public static void main(String[] args) {
		Vaporizer v =  new Reactor();
		v.vaporize(); //Boiling...
		              //Vaporized!
		Boiler.shutdown(); //shutting down
		
	}

	@Override
	public void boil() {
		System.out.println("Boiling..."); 
	}

}
