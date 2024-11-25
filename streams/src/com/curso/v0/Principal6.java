package com.curso.v0;

import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;

public class Principal6 {

	public static void main(String[] args) {

		Stream<String> stream = Stream.of("w", "o", "l", "f");

		Optional<String> word = stream.reduce((s, c) -> s + c); 
		
		word.ifPresent(c -> System.out.println(c)); // wolf
		
		System.out.println("********");
		
		Stream<String> stream1 = Stream.of();

		Optional<String> word1 = stream1.reduce((s, c) -> s + c); 
		
		System.out.println(word1.orElse("Sin Dato")); // Sin Dato:
		
		System.out.println("********");
		
		Stream<String> stream2 = Stream.of("w", "o", "l", "f");

		Optional<String>  word2 = stream2.reduce((s, c) -> s + c); 
		
		System.out.println(word2.orElse("Sin Dato")); // wolf
		
		System.out.println("********");
		
		BinaryOperator<Integer> op = (a, b) -> a * b;

		Stream<Integer> empty = Stream.empty();
		Stream<Integer> oneElement = Stream.of(3); 
		Stream<Integer> threeElements = Stream.of(3, 5, 6);

		empty.reduce(op).ifPresent(System.out::println); // no output 
		oneElement.reduce(op).ifPresent(System.out::println); // 3 
		threeElements.reduce(op).ifPresent(System.out::println); // 90
		
		System.out.println("********");

		
		Stream<String> stream3 = Stream.of("w", "o", "l", "f!");
		int length = stream3.reduce(0, 
				(i, s) -> i+s.length(), 
				(a, b) -> a+b); 
		System.out.println(length);
	}

}
