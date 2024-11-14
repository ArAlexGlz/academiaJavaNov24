package com.curso.v1;

import java.util.*;

public class Principal3 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();

		list.add("hawk"); 
		list.add("robin"); 
		
		Object[] objectArray = list.toArray();
		
		for (Object o:objectArray)
			System.out.println(o);
		
		System.out.println("***********");
		
		String[] stringArray = list.toArray(new String[0]);
		
		list.clear();
		
		for (String s:stringArray)
			System.out.println(s);
		
	}

}
