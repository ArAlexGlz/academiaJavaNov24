package com.curso.v1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Principal {
	
	public static void main(String[] args) {
		String[] array1 = {"a", "b", "c"};
		String[] array2 = new String[] {"a", "b", "c"};
		
		//System.out.println(Arrays.toString(array1));
		
		List<String> asList = Arrays.asList(array1);
		//System.out.println(asList.getClass().getName());
		//asList.add("d"); //NO SE PUEDE
		//asList.remove("a"); //NO SE PUEDE
		System.out.println(asList);
		asList.set(1, "z");
		System.out.println(asList);
		System.out.println("*****ARRAY******");
		System.out.println(Arrays.toString(array1));//a,z,c
		array1[1] = "w";
		System.out.println("***Lista: "+asList);
		
		System.out.println("***********");
		asList = List.of(array2);
		System.out.println(asList);
		//asList.set(1, "z"); //NO SE PUEDE
		System.out.println("***********");

		ArrayList<String> list3 = new ArrayList<>(10);
		
		
		var list = new ArrayList<>(); 
		list.add("a"); 
		
		for (Object s: list) {
			System.out.println(s);
		}
		
		
	}

}
