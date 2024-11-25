package com.curso.v0;

import java.util.Optional;

public class Principal4 {

	public static void main(String[] args) {

		Optional<Double> opt = average();
		
		Double d1 = opt.orElse(Double.NaN);
		
		System.out.println(d1);
		
		Double d2 = opt.orElseGet(() -> Math.random());
		
		System.out.println(d2);
		
		System.out.println(opt.orElseThrow());

		
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
