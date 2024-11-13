package com.nov13.v0;

public class Principal {

	public static void main(String[] args) {

		int numFish = 4;
		
		//String anotherFish1 = numFish + 1; //No compila
		String anotherFish1 = numFish + 1+ ""; //5
		String anotherFish2 = "" + numFish + 1; //41
		
		System.out.println(anotherFish2); //
	}

}
