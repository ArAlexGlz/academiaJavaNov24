package com.nov21.v0;

public class Hello1<T> {
	
	T t;

	public Hello1(T t) { 
		this.t = t; 
	}
	
	private <Z> void println(Z message) { 
		System.out.println(t + "-" + message);
	}
	
	public static void main(String[] args) {
		new Hello1<String>("hi").<Integer>println(1); //hi-1
		new Hello1("hola").<Boolean>println(true); //hola-true
		new Hello1<StringBuilder>(
				new StringBuilder("hello")).<Long>println(100L); //hello-100
	}
	
}
