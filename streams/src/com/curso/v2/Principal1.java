package com.curso.v2;

import java.util.*;

public class Principal1 {

	public static void main(String[] args) {
		demoOO();
		System.out.println("****");
		demoFuncional();
	}
	
	static void demoFuncional(){
		List<String> list = List.of("Toby", "Anna", "Leroy", "Alex"); 
		
		//list.stream().filter(n -> n.length() == 4).sorted().limit(2).forEach(System.out::println);
		
		list.stream().filter(n -> n.length() == 4) 
		             .sorted() 
		             .limit(2) 
		             .forEach(System.out::println);
	}
	
	static void demoOO() {
		List<String> list = List.of("Toby", "Anna", "Leroy", "Alex");

		List<String> filtered = new ArrayList<>();

		for (String name: list) 
			if (name.length() == 4) 
				filtered.add(name); //Toby, Anna, Alex
		
		Collections.sort(filtered); //Alex, Anna, Toby
		
		//System.out.println(filtered);

		Iterator<String> iter = filtered.iterator();
		
		if (iter.hasNext()) 
			System.out.println(iter.next());//Alex
		if (iter.hasNext()) 
			System.out.println(iter.next());//Anna
		
	}
	
	

}
