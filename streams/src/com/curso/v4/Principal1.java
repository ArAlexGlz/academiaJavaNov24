package com.curso.v4;

import java.util.List;
import java.util.Spliterator;

public class Principal1 {
	
	public static void main(String[] args) {
		List<String> lista = 
				List.of("bird-", "bunny-", "cat-", "dog-", "fish-", "lamb-", "mouse-");
	
		System.out.println(lista);
		
		Spliterator<String> originalBagOfFood =lista.spliterator();
		
		originalBagOfFood.forEachRemaining(System.out::print);
	
		Spliterator<String> emmasBag = originalBagOfFood.trySplit();
//		
//		emmasBag.forEachRemaining(System.out::print);
	}

}
