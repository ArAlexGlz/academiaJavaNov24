package com.curso.v1;

public class GoodOne {

	int theval;
	
	public int hashcode() {
		return theval%3; //0,1,2 
	}
	
	//Si hashcode() asigna el número 1
	//¿Es el mismo número? R: No necesariamete
	//a=10 y b=10 
	//a=10 y b=4 
	
	//a=10 y b=10 //equals()=true
	//a=10 y b=4  //equals()=false
	

}
