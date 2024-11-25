package com.curso.v0;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Principal7 {

	public static void main(String[] args) {

		Stream<String> stream = Stream.of("w", "o", "l", "f");
		
		StringBuilder word = stream.collect( 
				() -> new StringBuilder(), 
				(x,y) -> x.append(y), 
				(x,y) -> x.append(y));
		
		System.out.println(word);
		
		Stream<String> stream1 = Stream.of("w", "o", "l", "f");
		
		System.out.println("**************");

		TreeSet<String> set = stream1.collect(
				() -> new TreeSet<>(), 
				(tree,y) -> tree.add(y),
				(tree,otroTree) -> tree.addAll(otroTree));

		System.out.println(set); // [f, l, o, w]
		
		System.out.println("**************");
		
		Stream<String> stream2 = Stream.of("w", "o", "l", "f");

		TreeSet<String> set1 = stream2.collect(
				Collectors.toCollection(() -> new TreeSet<>())); 
		
		System.out.println(set1); // [f, l, o, w]
		
		System.out.println("**************");
		
		Stream<String> stream3 = Stream.of("f","w", "o", "l", "f");

		Set<String> set2 = stream3.collect(Collectors.toSet()); 
		
		System.out.println(set2); // [f, w, l, o]
		
		System.out.println("**************");
		
		Stream<String> stream4 = Stream.of("f","w", "o", "l", "f");

		List<String> list = stream4.collect(Collectors.toList()); 
		
		System.out.println(list); // [f, w, l, o,f]
	}

}
