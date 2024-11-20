package com.curso.actual.v0;

public class Q21 {

	public static void main(String[] args) {
		String name = "Spot";
		
		int age = 4;
		
		String str = "My dog " + name + " is "+ age;
		
		System.out.println(str);
		
		System.out.println("*****StringBuilder*******");
		
		StringBuilder sb = new StringBuilder();
		
		//sb.append("My dog " + name + " is "+ age);
		
		//sb.insert(0,"My dog ").append(name + " is "+ age);
		
		sb.append("My dog ").append(name).append(" is ").append(age);
				
		System.out.println(sb);
		
		
		
	}

}
