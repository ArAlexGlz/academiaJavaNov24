package com.nov21.v1;

import java.util.Arrays;
import java.util.Comparator;

public class MyComparator {

	public static void main(String[] args) {
		
		String[] values= {"123","Abb","aab"};

		Comparator<String> comp = 
				(x,z)-> z.toLowerCase().compareTo(x.toLowerCase());
		
		Arrays.sort(values,comp);
		for (var s: values) 
			System.out.print(s + " ");
		//Abb,aab,123

	}

}
