package com.curso.v0;

abstract class Saloon{
	//COMPORTAMIENTO
	protected int m1(){ 
		return 0;
	}
}

//public protected (default*) private

public class OverridingSaloon extends Saloon {
	
    @Override	
	public int m1(){ 
		return 1;
	}

}
