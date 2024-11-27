package com.book.v0;

import java.util.*;

public class Question10 {

	public static void main(String[] args) {

		
		var list = List.of(1, 2, 3); 
		var set = Set.of(1, 2, 3); 
		var map = Map.of(1, 2, 3, 4);

		//list.forEach(System.out::println);
		//set.forEach(System.out::println);
		//map.forEach(System.out::println); //NO SE PUEDE
		map.keySet().forEach(System.out::println);
		map.values().forEach(System.out::println);
		
		//map.valueSet();
	}

}
