package com.nov21.v2;

import java.util.Arrays;
import java.util.Comparator;

public class MyComparator {

	public static void main(String[] args) {
		
		String[] values= {"123","Abb","aab"};

		Arrays.sort(values,
				(x,z)-> z.toLowerCase().compareTo(x.toLowerCase()));
		
		for (var s: values) 
			System.out.print(s + " ");
		//Abb,aab,123

	}

}
