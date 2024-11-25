package com.curso.v0;

import java.util.Optional;

public class Principal3 {

	public static void main(String[] args) {

		Optional<Double> opt1 = average(90, 100);
		opt1.ifPresent(d -> System.out.println(d));
		
		Optional<Double> opt2 = average(); //Optional.empty()
		opt2.ifPresent(d -> System.out.println(d));
		
		
	}
	
	public static Optional<Double> average(int... scores) {
		if (scores.length == 0) 
			return Optional.empty();
		
		int sum = 0;
		for (int score: scores) 
			sum += score;
		
		return Optional.of((double) sum / scores.length);
	}

}
