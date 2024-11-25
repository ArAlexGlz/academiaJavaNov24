package com.curso.v0;

import java.util.stream.Stream;

public class Principal5 {

	public static void main(String[] args) {

		Stream<String> stream = Stream.of("w", "o", "l", "f");

		String word = stream.reduce("",(s, c) -> s + c); 
		
		System.out.println(word); // wolf
		
		System.out.println("********");
		
		Stream<String> stream1 = Stream.of();

		String word1 = stream1.reduce("Cadena:",(s, c) -> s + c); 
		
		System.out.println(word1); // Cadena:
		
		System.out.println("********");
		
		Stream<String> stream2 = Stream.of("w", "o", "l", "f");

		String word2 = stream2.reduce("Cadena:",(s, c) -> s + c); 
		
		System.out.println(word2); // Cadena:
		
		System.out.println("********");

		Stream<Integer> stream3 = Stream.of(3, 5, 6);

		System.out.println(stream3.reduce(1, (a, b) -> a*b));
	}

}
