package com.curso.actual.v0;

public class Bark {

	//CLASE ANIDADA
	abstract class Dog { //LINE 5
		public abstract void bark(); //LINE6
	} //LINE7
	//LINE8
	
	
	public class Poodle extends Dog { //LINE9
		public void bark() {
			System.out.println("woof");
		}
	}
}
