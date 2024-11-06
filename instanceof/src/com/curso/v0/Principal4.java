package com.curso.v0;

import java.math.BigDecimal;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

public class Principal4 {

	
	public static void main(String[] args) {

		System.out.println("Java 16");
		Number n1 = getNumber(); 
		
		if (n1 instanceof Integer i) 
			System.out.println("Integer: " + i.intValue());
		else if (n1 instanceof Double d) 
			System.out.println("Double: "+ d.doubleValue());
		else if (n1 instanceof BigDecimal bd) 
			System.out.println("BigDecimal: "+ bd.doubleValue());
		else 
			System.out.println("AtomicInteger: "+((AtomicInteger)n1).doubleValue());
	}

	private static Number getNumber() {
		
		Number[] numbers = {
				new Integer(4),
				new Double(5.0),
				new BigDecimal(8.0),
				new AtomicInteger(5)	
		};
		
		return numbers[new Random().nextInt(numbers.length)];
	}

}
