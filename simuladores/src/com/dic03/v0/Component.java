package com.dic03.v0;

import java.io.FileNotFoundException;

//Consider these two interfaces:  

interface I1 {
	void m1() throws java.io.IOException; //public
}

interface I2 {
	void m1() throws java.io.FileNotFoundException;
} 

// Which of the following are valid method declarations for a class that says it
// implements I1 and I2 ?

public class Component implements I1,I2 {
	
	@Override
	public void m1() throws FileNotFoundException  {
		
	}
	
}
