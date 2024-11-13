package com.curso.v2;

import java.time.*;

public class Principal {

	public static void main(String[] args) {
		
		Instant begin = Instant.now();

		for (int x=0; x< 1_000_000;x++)
			System.out.println(x);
		
		Instant end = Instant.now();

		Duration dur = Duration.between(begin, end);
		
		System.out.println("Duration: "+dur);
			
	}

}
