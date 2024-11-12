package com.curso.v3;

public class GoodOne {

	int theval;
	
	public static void main(String[] args) {
		GoodOne a = new GoodOne();
		a.theval = 2;
		GoodOne b = new GoodOne();
		b.theval = 999;
		
		System.out.println(a.equals(b));
	}
	
	public int hashcode() {
		return theval%3; //0,1,2 
	}
	
	@Override
	public boolean equals(Object obj) {
		//return theval%2 == 0? true : false;
		return true;
	}

}
