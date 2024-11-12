package com.curso.v2;

import java.util.*;

interface Birdie{
	//public
	void fly(); //abstract (sin comportamiento)
}

class Dino implements Birdie{
	public void fly() {
		System.out.println("Dino flies");
	}
	public void eat() {
		System.out.println("Dino eats");
	}
}

class Bino extends Dino{
	public void fly() {
		System.out.println("Bino flies");
	}
	public void eat() {
		System.out.println("Bino eats");
	}
}

public class TestClass {

	public static void main(String[] args) {
		
		List<Birdie> m = new ArrayList<>();
		
		m.add(new Dino());
		m.add(new Bino());
		
		for (Birdie b :m) {
			b.fly();
			//b.eat(); 
			((Dino)b).eat();
		}


	}

}
