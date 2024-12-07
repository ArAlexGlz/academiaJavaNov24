package com.dic06.v0;

class Numero<T extends Number> {
	
	T t;

	public Numero(T t) {
		this.t = t;
	}

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
}
