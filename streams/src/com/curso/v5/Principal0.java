package com.curso.v5;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Principal0 {

	public static void main(String[] args) {
		List<String> lista = List.of("lions", "tigers", "bears");
		Stream<String> ohMy = lista.stream(); 
		String result = ohMy.collect(Collectors.joining(", ")); 
		System.out.println(result);
		
		System.out.println("**********");
		
		System.out.println(List.of("lions", "tigers", "bears")
							.stream()
							.collect(Collectors.joining(", ")));
	}

}
