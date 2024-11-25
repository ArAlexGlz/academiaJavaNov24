package com.curso.v0;

import java.util.Optional;

public class Principal2 {

	public static void main(String[] args) {
		Optional<Double> opt = average();

		if (opt.isPresent()) 
			System.out.println(opt.get()); // 95.0
		
		System.out.println("***********");
		
		Optional<Integer> o1 = Optional.ofNullable(10);
		System.out.println(o1);
		
		Optional<Integer> o2 = Optional.ofNullable(null);
		System.out.println(o2);
		
		System.out.println("Fin de Programa");
		
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
