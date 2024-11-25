package com.curso.v1;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Principal {

	public static void main(String[] args) {
		
		String[] arreglo = {"monkey", "gorilla","mono", "bonobo"};
		
		Stream<String> stream = Arrays.stream(arreglo);

		stream.filter(x -> !x.startsWith("m")) 
		      .forEach(u -> System.out.println(u)); // monkey
		
		System.out.println("*************************");
		
		List<String> lista = List.of("duck", "duck", "duck", "goose");
		
		Stream<String> s = lista.stream();

		s.distinct() 
		 .forEach(z -> System.out.println(z)); // duckgoose
		
		System.out.println("*************************");

		Stream<Integer> stream1 = Stream.iterate(1, n -> n + 2);
		//1,3,5,7,9,11,13,15,17......

		stream1.skip(5)
			   .limit(2) 
			   .forEach(w -> System.out.println(w)); //11 13
		
		System.out.println("*************************");
		
		Stream<Integer> stream2 = Stream.iterate(1, n -> n + 2);
		//1,3,5,7,9,11,13,15,17......

		Set<Integer> set = stream2.skip(5)
			   .limit(4) 
			   .collect(Collectors.toSet());
		
		System.out.println(set);
		
		System.out.println("*************************");

			   
		
	}

}
