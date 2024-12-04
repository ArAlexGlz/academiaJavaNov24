package com.dic04.v0;

public enum Coffee {

	ESPRESSO("Very Strong"), 
	MOCHA("Strong"), 
	LATTE("light");

	public String strength;

	Coffee(String strength) { // 4
		this.strength = strength; // 5
	}

	// Coffee(){}

}
