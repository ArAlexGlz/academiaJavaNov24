package com.dic06.v0;

import java.util.*;

public class Principal2 {

	public static void main(String[] args) {

		List<Integer> names = Arrays.asList(1, 2, 3);

		names.forEach( x -> x = x + 1);
		
		names.forEach(System.out::print);
		
		int i = 10;
		
		Double d = (double)i;
		
	}

}
