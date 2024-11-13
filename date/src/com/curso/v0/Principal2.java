package com.curso.v0;

import java.time.*;

public class Principal2 {

	public static void main(String[] args) {

		LocalDate date1 = LocalDate.of(2024, Month.NOVEMBER, 13);
		LocalDate date2 = LocalDate.now();
		
		System.out.println(date1);
		//System.out.println(date2);
		
		date1 = date1.plusDays(2); 
		System.out.println(date1); 
		
//		String cadena = "Hola";
//		cadena = cadena.concat(" Mundo");
//		System.out.println(cadena); 
		
		date1 = date1.plusWeeks(1); 
		System.out.println(date1);
		
		date1 = date1.plusMonths(1); 
		System.out.println(date1);
		
		date1 = date1.plusYears(5);
		System.out.println(date1);
		
		date2 = date2
				.plusDays(2)
				.plusWeeks(1)
				.plusMonths(1)
				.plusYears(5);
		
		System.out.println("date2: "+date2);
		
		
	}

}
