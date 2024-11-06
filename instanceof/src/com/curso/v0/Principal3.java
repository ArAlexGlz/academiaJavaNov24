package com.curso.v0;

import java.math.BigDecimal;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

public class Principal3 {

	
	public static void main(String[] args) {

		Number n1 = getNumber(); 
		
		if (n1 instanceof Integer) 
			System.out.println("Integer: "+((Integer)n1).intValue());
		else if (n1 instanceof Double) 
			System.out.println("Double: "+((Double)n1).doubleValue());
		else if (n1 instanceof BigDecimal) 
			System.out.println("BigDecimal: "+((BigDecimal)n1).doubleValue());
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
