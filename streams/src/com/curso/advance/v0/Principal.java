package com.curso.advance.v0;

import java.util.*;
import java.util.stream.*;

public class Principal {

	public static void main(String[] args) {
		
		String[] arreglo = {"lions","poh" ,"tigers", "bears", "ducks","ave"};

		Stream<String> ohMy = Arrays.stream(arreglo);
		
		Map<Integer, List<String>> map = 
				
				ohMy.collect(Collectors.groupingBy(String::length)); 
		
		map.entrySet().forEach(x -> System.out.println("Key: "+x.getKey()
									+ ", Lista: "+x.getValue()));
		
		System.out.println("************");
		
		Stream<String> ohMy1 = Arrays.stream(arreglo);
		
		Map<Integer, Set<String>> map1 = 
				
				ohMy1.collect
						(Collectors.groupingBy( String::length,
												Collectors.toSet())
						);
		
		map1.entrySet().forEach(x -> System.out.println("Key: "+x.getKey()
		+ ", Set: "+x.getValue()));
		
		System.out.println("Map: "+map1.getClass()); //HashMap
		System.out.println("Set: "+map1.values().getClass()); //HashSet
		
		System.out.println("************");
		
		Stream<String> ohMy2 = Arrays.stream(arreglo);
		
		Map<Integer, Set<String>> map2 = 
				
				ohMy2.collect
						(Collectors.groupingBy( String::length,
												() -> new TreeMap<>(),
												Collectors.toSet())
						);
		
		map1.entrySet().forEach(x -> System.out.println("Key: "+x.getKey()
		+ ", Set: "+x.getValue()));

		System.out.println("Map: "+map2.getClass()); //TreeMap
		System.out.println("Set: "+map2.values().getClass()); //HashSet
	}

}
