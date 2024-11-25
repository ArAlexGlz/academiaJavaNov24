package com.curso.v0;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

public class Principal2 {

	public static void main(String[] args) {

		Stream<String> s = Stream.of("monkey", "gorilla", "bonobo");
		
		long conteo = s.count();

		System.out.println(conteo); //3
		
		System.out.println("**************");
		
		Stream<String> s1 = Stream.of("monkey", "ape", "bonobo"); //ape
		
		Comparator<String> comp = (x,y) -> x.length() - y.length();
		
		Optional<String> optRes = s1.min(comp);
		
		if (optRes.isPresent())
			System.out.println(optRes.get()); 
		
	}

}
