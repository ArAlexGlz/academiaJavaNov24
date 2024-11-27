package com.book.v0;

record Hola<T>(T t) {
	public Hola(T t) { 
		this.t = t; 
	}
	
	private <T> void println(T message) {
		System.out.print(t + "-" + message);
	}
}

class Hello<T> { //<T> A nivel clase
	T t;
	public Hello(T t) { 
		this.t = t;
	}
	
	//<T> A nivel método
	private <T> void println(T t) {
		System.out.print(this.t + "-" + t);
	}
	
	public static void main(String[] args) {
		//GenericClass: String
		//GenericMethod: Integer
		new Hello<String>("hi").println(1); //hi-1
		new Hello("hola").println(true); //hola-true
	}
}

