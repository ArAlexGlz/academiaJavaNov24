package com.curso.v0;

public class Question07 {
	
	public static void main(String[] args) {
		
		int ph = 7, vis = 2;
		
		//                        (  true  ||   false)
		//                        (        true      )
		//                true  &          true
		boolean clear = vis > 1 & (vis < 9 || ph < 2);
		System.out.println(clear); //true
		
		//               false 
		boolean safe = (vis > 2) && (ph++ > 1);
		System.out.println("safe: "+safe); //false
		System.out.println("ph:"+ph); //7
		System.out.println("*********");
		boolean tasty = 7 <= --ph;
		System.out.println("ph: "+ph); //6
		System.out.println("tasty: "+tasty);//false
		
		
		
		
	}

}
