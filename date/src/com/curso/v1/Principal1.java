package com.curso.v1;

import java.time.*;

public class Principal1 {

	public static void main(String[] args) {

		LocalDate start = LocalDate.of(2022, Month.JANUARY, 1);
		LocalDate end = LocalDate.of(2022, Month.MARCH, 30);
		Period period = Period.ofMonths(2);
		performAnimalEnrichment(start, end, period);

	}

	private static void performAnimalEnrichment(LocalDate start, 
			LocalDate end, Period period) {
		
		LocalDate upTo = start;
		while (upTo.isBefore(end)) { // check if still before end
			System.out.println("give new toy: " + upTo);
			upTo = upTo.plus(period); // add a month
		}
	}

}
