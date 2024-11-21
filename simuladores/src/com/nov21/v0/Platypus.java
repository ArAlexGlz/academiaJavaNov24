package com.nov21.v0;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class Platypus {

	private String name;
	private int beakLength;

	public Platypus(String name, int beakLength) {
		this.name = name;
		this.beakLength = beakLength;
	}
	
	String getName() {
		return name;
	}
	
	int getBeakLength() {
		return beakLength;
	}

	@Override
	public String toString() {
		return name + " " + beakLength;
	}

	public static void main(String[] args) {
		Platypus p0 = new Platypus("Trifulio", 4);
		Platypus p2 = new Platypus("Peter", 3);
		Platypus p1 = new Platypus("Paula", 3);
		Platypus p3 = new Platypus("Peter", 7);

		List<Platypus> list = Arrays.asList(p0,p1,p2,p3);
		
		Function<Platypus,String> fun1 = e -> e.getName();
		
		Collections.sort(list,Comparator.comparing(fun1) );
		
		//list.forEach(p -> System.out.println(p));
		
		Function<Platypus,Integer> fun2 = e -> e.getBeakLength();
		
		//Collections.sort(list,Comparator.comparing(fun2).reversed());
		Collections.sort(list,Comparator.comparing(fun2).thenComparing(fun1));

		list.forEach(p -> System.out.println(p));

		
	}

}
