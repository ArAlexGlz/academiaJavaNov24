package com.curso.v0;

class A {
	A(String s){ //4
		super();
		System.out.println("PASO1");
	}
}

class B extends A{
	B(){ //3
		super("Hello");
		System.out.println("PASO2");
	}
}

class C extends B{
	C(){
		this("Hola"); //1
		System.out.println("PASO3");
	}

	C(String string) { //2
		//super();
		System.out.println("PASO4");

	}
}


public class Principal {

	public static void main(String[] args) {
		C c = new C();
		System.out.println(c);
		//PASO1
		//PASO2
		//PASO4
		//PASO3
		//Hexadecimal
		
	}

}
