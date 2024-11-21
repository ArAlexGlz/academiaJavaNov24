package com.nov21.v1;

public class Alpaca {
	public Number hairy(Number x) {
		return null;
	}
	
	long other() {
		return 0;
	}
	
	CharSequence otro() {
		return null;
	}
}

//Demos de Covarianza
class SubAlpaca extends Alpaca {
	@Override
	public Integer hairy(Number x) { 
		return null;
	}
	
	long other() {
		return 0;
	}
	
	@Override
	StringBuilder otro() {
		return null;
	}

}
