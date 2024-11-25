package com.curso.v1;

import java.util.Comparator;
import java.util.stream.Stream;

public class Principal3 {

	public static void main(String[] args) {

		Stream<String> s = Stream.of("brown-", "bear-"); 
		s.sorted() 
		 .forEach(System.out::print);
		
		System.out.println("********");
		
		Stream<String> s1 = Stream.of("brown bear-", "grizzly-"); 
		s1.sorted(Comparator.reverseOrder()) 
		  .forEach(System.out::print);
		
		System.out.println("********");
		
		Stream<String> s2 = Stream.of("brown bear-", "grizzly-"); 
		long r = s2.sorted(Comparator.reverseOrder())
		  .count();
		System.out.println(r);
		
	}

}
