package com.curso.v1;

abstract interface Saloon{
	//public abstract
	int m1();
}

//public protected (default*) private

public class OverridingSaloon implements Saloon {
	
	@Override	
	public int m1(){ 
		return 1;
	}

}
