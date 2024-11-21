package com.nov21.v0;

import java.util.Arrays;
import java.util.Comparator;

public class MyComparator implements Comparator<String> {

	public static void main(String[] args) {
		
		String[] values= {"123","Abb","aab"};
		//123,Abb,aab //ORDEN NATURAL
		//123,AAB,ABB
		//ABB,AAB,123
		//Abb,aab,123
		Arrays.sort(values,new MyComparator());
		for (var s: values) 
			System.out.print(s + " ");

	}

	@Override
	public int compare(String a, String b) {
		return b.toLowerCase().compareTo(a.toLowerCase());
	}

}
