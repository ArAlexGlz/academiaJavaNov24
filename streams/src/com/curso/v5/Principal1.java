package com.curso.v5;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Principal1 {

	public static void main(String[] args) {
		Stream<String> ohMy = Stream.of("lions", "tigers", "bears");
		//                                5        6        5
		Double result = ohMy.collect(
						Collectors.averagingInt(animal -> animal.length()));
		
		System.out.println(result);
	}

}
