package com.curso.v0;

public class CandyCounter {

	static long addCandy(double fruit, float vegetables) {
		return (int)(fruit + vegetables);
	}

	public static void main(String[] args) {
		
		System.out.print(addCandy(1.4, 2.4f) + ", "); //3
		System.out.print(addCandy(1.9, (float)4) + ", "); //5
		System.out.print(addCandy((long)(int)(short)2, (float)4)); //6 
		
		long l = 0;
		float f = 0.0F;
		
		//l = f; //NO SE PUEDE
		
		int i = 0;
		
		//i = f; //NO SE PUEDE
		
		f = i; //SI SE PUEDE
		
		double d = 0.0;
		
		//l = d; //NO SE PUEDE
		
		d = l; //SI SE PUEDE
		
	}

}
