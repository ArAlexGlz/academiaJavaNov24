package com.book.v0;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Platypus {

	private String name;
	private int beakLength;

	public Platypus(String name, int beakLength) {
		this.name = name;
		this.beakLength = beakLength;
	}

	@Override
	public String toString() {
		return name+ " " + beakLength;
	}

	String name() {
		return name;
	}

	int beakLength() {
		return beakLength;
	}

	public static void main(String[] args) {
		Platypus p0 = new Platypus("Zacarias", 8);
		Platypus p1 = new Platypus("Paula", 3);
		Platypus p2 = new Platypus("Peter", 5);
		Platypus p3 = new Platypus("Peter", 7);

		List<Platypus> list = Arrays.asList(p0, p1, p2, p3);

//		Collections.sort(list, 
//				Comparator.<Platypus,Integer>comparing(x -> x.beakLength())
//						  .reversed()
//						);

//		Collections.sort(list, Comparator.comparing(Platypus::name)
//				.thenComparingInt(Platypus::beakLength).reversed());
		
		Collections.sort(list, Comparator.<Platypus,String>comparing(p->p.name())
								.thenComparing(p->p.beakLength())
								.reversed()
				        );

		System.out.println(list);

	}

}
