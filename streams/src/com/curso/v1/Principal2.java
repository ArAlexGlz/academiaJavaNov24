package com.curso.v1;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Principal2 {

	public static void main(String[] args) {

		List<String> zero = List.of("Dog");
		List<String> one = List.of("Bonobo","Mono","Duck"); 
		List<String> two = List.of("Mama Gorilla", "Baby Gorilla");

		Stream<List<String>> animals = Stream.of(zero, one, two);

		animals.flatMap(m -> m.stream()) 
		       .forEach(t -> System.out.println(t));
		
		System.out.println("**********");
		
		Stream<List<String>> animals1 = Stream.of(zero, one, two);

		List<String> lista = 
				animals1.flatMap(m -> m.stream()) 
		                .collect(Collectors.toList());
		
		System.out.println(lista);
		lista.forEach(t -> System.out.println(t));
		
		
		System.out.println("**********");
		
		Stream<List<String>> animals2 = Stream.of(zero, one, two);

		List<String> lista2 = 
				animals2.flatMap(m -> m.stream())
						.filter(x -> x.length()>4)
		                .collect(Collectors.toList());
		
		System.out.println(lista2);
		
		System.out.println("**********");
		
		Stream<List<String>> animals3 = Stream.of(zero, one, two);

		List<Integer> lista3 = 
				animals3.flatMap(m -> m.stream())
						.filter(x -> x.length()>4)
						.map(y -> y.length())
		                .collect(Collectors.toList());
		
		System.out.println(lista3);
		
		
		
		
		
	}

}
