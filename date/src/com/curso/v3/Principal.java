package com.curso.v3;

import java.time.*;

public class Principal {
	
	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2022, Month.MARCH, 13); 
		LocalTime time = LocalTime.of(1, 30); 
		ZoneId zone = ZoneId.of("US/Eastern"); 
		ZonedDateTime dateTime = ZonedDateTime.of(date, time, zone);
		System.out.println(dateTime); // 2022–03-13T01:30-05:00[US/Eastern] 
		System.out.println(dateTime.getHour()); // 1 
		System.out.println(dateTime.getOffset()); // -05:00
		
		dateTime = dateTime.plusHours(1); //AUMENTAR 1 HORA
		
		System.out.println(dateTime); // 2022–03-13T03:30-04:00[US/Eastern]
		System.out.println(dateTime.getHour()); // 3 
		System.out.println(dateTime.getOffset()); // -04:00
		
		System.out.println("****Eastern******");
		
		LocalDate date1 = LocalDate.of(2024, Month.MARCH, 10); 
		LocalTime time1 = LocalTime.of(1, 30); 
		ZoneId zone1 = ZoneId.of("America/Mexico_City"); 
		ZonedDateTime dateTime1 = ZonedDateTime.of(date1, time1, zone1);
		System.out.println(dateTime1);  
		System.out.println(dateTime1.getHour()); // 1 
		System.out.println(dateTime1.getOffset()); // -05:00
		
		dateTime1 = dateTime1.plusHours(1);
		
		System.out.println(dateTime1);  
		System.out.println(dateTime1.getHour()); // 3 
		System.out.println(dateTime1.getOffset()); // -04:00
		
	}

}
