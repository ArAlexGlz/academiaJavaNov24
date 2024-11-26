package com.curso.advance.v0;

import java.util.*;
import java.util.stream.*;

public class Principal1 {
	
	public static void main(String[] args) {
		Stream<String> ohMy = Stream.of("lions", "tigers", "bears"); 
		
		Map<Boolean, List<String>> map = 
			ohMy.collect( 
				Collectors.partitioningBy(s -> s.length() <= 5)); 
		
		System.out.println(map);
		
		System.out.println("*************");
	}

}
