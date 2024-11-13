package com.curso.v0;

import java.time.*;

public class Principal {

	public static void main(String[] args) {
		System.out.println(LocalDate.now());
		System.out.println(LocalTime.now());
		System.out.println(LocalDateTime.now());
		System.out.println(ZonedDateTime.now());
		
		LocalDate date1 = LocalDate.of(2022, Month.JANUARY , 20); 
		LocalDate date2 = LocalDate.of(2022, 1, 20);
		
		System.out.println(date1);
		System.out.println(date2);
		
		System.out.println("*****************");
		
		LocalDate d = LocalDate.now();
		LocalTime t = LocalTime.now();
		ZoneId z = ZoneId.of("America/Mexico_City");
				
		ZonedDateTime zonedDateTime = ZonedDateTime.of(d, t, z);
		System.out.println( "zonedDateTime: "+zonedDateTime);
		
		Instant instant = zonedDateTime.toInstant();
		System.out.println( "instant: "+instant);

		

	}

}
