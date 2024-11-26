package com.curso.v6;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Principal {

	public static void main(String[] args) {
		Stream<String> ohMy = Stream.of( "dino","lions", "tigers", "bears");
		
		Map<String, Integer> map = ohMy.collect( 
				Collectors.toMap(
						s -> s, 
						a -> a.length())); 
		
		System.out.println(map); // {lions=5, bears=5, tigers=6}
	}

}
