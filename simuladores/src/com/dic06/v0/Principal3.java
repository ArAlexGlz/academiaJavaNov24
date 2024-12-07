package com.dic06.v0;

import java.util.Arrays;
import java.util.stream.*;

public class Principal3 {
	
	Principal3() throws Exception{
		
	}

	public static void main(String[] args) {
		
		int[] arrayInt = {1,2,3};
		IntStream is = Arrays.stream(arrayInt); 

		double[] arrayDouble = {1.0,2.0,3.0};
		DoubleStream ds = Arrays.stream(arrayDouble); 

		long[] arrayLong =  {1,2,3};
		LongStream ls = Arrays. stream(arrayLong);
	}

}
