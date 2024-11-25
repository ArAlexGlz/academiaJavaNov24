package com.curso.v0;

import java.util.Optional;

public class Principal1 {

	public static void main(String[] args) {
		Optional<Double> od1 = average(); //Optional.empty()
		Optional<Double> od2 = average(1,2,3,4,5); //Optional[3.0]
		System.out.println(od1);
		System.out.println(od2);
		
		System.out.println(average(90, 100)); // Optional[95.0] 
		System.out.println(average()); //Optional.empty()
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
