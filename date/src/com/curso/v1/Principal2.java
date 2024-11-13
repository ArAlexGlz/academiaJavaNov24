package com.curso.v1;

import java.time.Period;

public class Principal2 {
	
	public static void main(String[] args) {
		Period wrong = Period
				.ofYears(1) //NO SE CONSIDERA
				.ofWeeks(1);
		
		System.out.println(wrong);
		
		Period good = Period.of(1, 0, 7);
		
		System.out.println(good);
	}

}
