package com.curso.v0;

class A { //Modificador Acceso default
	
	private int i;
	
	public void modifyOther(A a1) {
		a1.i = 20;
		System.out.println(a1.i);
	}
	
	public static void main(String[] args) {
		new A().modifyOther(new A());
		
		
	}

}
