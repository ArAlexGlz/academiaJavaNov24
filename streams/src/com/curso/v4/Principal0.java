package com.curso.v4;

import java.util.Optional;

public class Principal0 {

	public static void main(String[] args) {
		
		Optional<Integer> opt = Optional.of(55);
		
		threeDigitB(opt);
	}
	
	private static void threeDigit(Optional<Integer> optional) { 
		optional.map(n -> "" + n) // part 1 
		.filter(s -> s.length() == 3) // part 2 
		.ifPresent(System.out::println); // part 3 }
	}
	
	private static void threeDigitB(Optional<Integer> optional) { 
		Optional<String> optStr = optional.map(n -> "" + n);
		Optional<String> optStr2 = optStr.filter(s -> s.length() == 3);
		optStr2.ifPresent(System.out::println); 
	}

}
