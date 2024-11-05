package com.curso.v1;

interface Flyer {
	String getName();
}

class Bird implements Flyer {
	
	public String name;

	public Bird(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return name;
	}
}

class Eagle extends Bird {
	public Eagle(String name) {
		super(name);
	}
}

public class TestClass {
	public static void main(String[] args) throws Exception {
		Flyer f = new Eagle("American Bald Eagle"); 
		// PRINT NAME HERE
		System.out.println(f.getName());
		
	}
}
