package com.nov21.v0;

public class Hello<T> {
	
	T t;

	public Hello(T t) { 
		this.t = t; 
	}
	
	private <T> void println(T message) { 
		System.out.println(t + "-" + message);
	}
	
	public static void main(String[] args) {
		new Hello<String>("hi").println(1); //hi-1
		new Hello("hola").<Boolean>println(true); //hola-true
	}
	
}
