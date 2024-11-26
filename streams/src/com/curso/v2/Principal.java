package com.curso.v2;

import java.util.stream.Stream;

public class Principal {

	public static void main(String[] args) {
		Stream<String> stream = Stream.of("black bear", "brown bear", "grizzly"); 
		long count = stream.filter(s -> s.startsWith("g")) 
				           .peek(y -> System.out.println(y))
				           .count();
		System.out.println(count);
	}

}
