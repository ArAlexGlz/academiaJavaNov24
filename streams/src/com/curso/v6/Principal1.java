package com.curso.v6;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Principal1 {
	
	public static void main(String[] args) {
		Stream<String> ohMy = Stream.of("lions", "ducks" ,"tigers", "bears"); 
		
		Map<Integer, String> map = ohMy.collect(
				
				Collectors.toMap(
						a -> a.length(), //5
						k -> k,
						(s1, s2) -> s1 + "," + s2)); //lions,ducks,bears

				System.out.println(map); 
				System.out.println(map.getClass());
	}

}
