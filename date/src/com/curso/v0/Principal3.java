package com.curso.v0;

import java.time.*;

public class Principal3 {

	public static void main(String[] args) {

		LocalDate date = LocalDate.of(2024, Month.JANUARY, 20); 
		LocalTime time = LocalTime.of(5, 15);
		
		LocalDateTime dateTime = LocalDateTime.of(date, time);
		
		System.out.println(dateTime); // 2024–01–20T05:15 
		dateTime = dateTime.minusDays(1); 
		System.out.println(dateTime);
		
		dateTime = dateTime.minusHours(10); 
		System.out.println(dateTime);
		
		dateTime = dateTime.minusSeconds(30); 
		System.out.println(dateTime);
		
		
		
	}

}
