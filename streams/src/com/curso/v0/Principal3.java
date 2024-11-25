package com.curso.v0;

import java.util.Optional;
import java.util.stream.Stream;

public class Principal3 {

	public static void main(String[] args) {

		Stream<String> s = Stream.of("monkey", "gorilla", "bonobo");
		
		s.findAny().ifPresent(System.out::println);
		
//		Optional<String> opt = s.findAny();
//		opt.ifPresent(x -> System.out.println(x));
		
		System.out.println("***************");
		
		Stream<String> infinite = Stream.generate(() -> "chimp");
		
		//infinite.forEach(z -> System.out.println(z));
		
		infinite.findAny().ifPresent(System.out::println);
	}

}
