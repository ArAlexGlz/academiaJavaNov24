package com.dic05.v0;

import java.util.*;

public class Question13 {
	
	
	public static void main(String[] args) {
		Comparator<Integer> c1 = (o1, o2) -> o2 - o1;

		Comparator<Integer> c2 = Comparator.naturalOrder(); //CORRECTO

		Comparator<Integer> c3 = Comparator.reverseOrder();
		
		List<Integer> list = Arrays.asList(5, 4, 7, 2); 
		
		Collections.sort(list, c2 );
		
		Collections.reverse(list); 
		Collections.reverse(list);
		
		System.out.println(Collections.binarySearch(list, 2));
	}

}
