package com.curso.v1;

import java.time.*;

public class Principal0 {

	public static void main(String[] args) {

		LocalDate start = LocalDate.of(2022, Month.JANUARY, 1);
		LocalDate end = LocalDate.of(2022, Month.MARCH, 30);
		performAnimalEnrichment(start, end);

	}

	private static void performAnimalEnrichment(LocalDate start, LocalDate end) {
		LocalDate upTo = start;
		while (upTo.isBefore(end)) { // check if still before end
			System.out.println("give new toy: " + upTo);
			upTo = upTo.plusMonths(1); // add a month
		}
	}

}
