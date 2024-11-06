package com.curso.v0;

public class Principal2 {

	
	public static void main(String[] args) {

		Number n1; 
		
		Double d1 = Double.valueOf(8.0);
		
		boolean  res = d1.isNaN();
				
		n1 = d1;
		
		if (n1 instanceof Double)
			res = ((Double)n1).isNaN();
		
		
	}

}
