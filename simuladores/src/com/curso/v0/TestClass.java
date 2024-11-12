package com.curso.v0;

public class TestClass {
	
	public int methodA(int a) {
		return a*2;
	}
	
	public long methodA(int pato,int a) {
		return pato*2;
	}

	//Overloading - Sobrecarga
	public int methodA(char a) {
		System.out.println("Entro por el char");
		return a*2;
	}
	
	
	public static void main(String[] args) {
		int i = 0;
		i = new TestClass().methodA(2); //<==
		System.out.println(i);
		
		i = new TestClass().methodA('a');
		System.out.println(i);
	}

}
