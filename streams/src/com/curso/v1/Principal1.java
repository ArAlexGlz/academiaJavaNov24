package com.curso.v1;

import java.util.Optional;
import java.util.stream.Stream;

public class Principal1 {

	public static void main(String[] args) {

		Stream<String> s = Stream.of("monkey", "gorilla", "bonobo");
		//                               6   ,     7    ,     6  

		Optional<Integer> opt= s.map(t -> t.length()) 
		                        .reduce((x,y)->x+y); //19
		
		opt.ifPresent(x->System.out.println(x));
		
		System.out.println("***********");
		
		Stream<String> s1 = Stream.of("monkey", "gorilla", "bonobo");
		//                               6   ,     7    ,     6  

		int i = s1.map(t -> t.length()) 
		          .reduce(0,(x,y)->x+y); //19
		
		System.out.println(i);
		
	}

}
