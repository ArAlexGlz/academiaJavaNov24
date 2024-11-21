package com.nov21.v0;

interface Rideable {
	String getGait(); //public abstract
}

public class Camel implements Rideable {
	int weight = 2;

	public static void main(String[] args) {
		new Camel().go(8);
	}

	void go(int speed) {
		speed++; //9
		++weight; //3 
		int walkrate = speed * weight; //27
		System.out.print(walkrate + getGait()); //27 mph, lope
	}

	@Override
	public String getGait() {
		return " mph, lope";
	}
}