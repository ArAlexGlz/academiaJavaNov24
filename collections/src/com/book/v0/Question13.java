package com.book.v0;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

class MIComparator implements Comparator<Integer>{
	@Override
	public int compare(Integer o1, Integer o2) {
		return o2 - o1;
	}
}

public class Question13 {
	
	public static void main(String[] args) {
		
		//DESCENTENTE : CLASE
		Comparator<Integer> c00 = new MIComparator();
		
		//DESCENTENTE : CLASE ANONIMA
		Comparator<Integer> c0 = new Comparator<>(){
			@Override
			public int compare(Integer o1, Integer o2) {
				return o2 - o1;
			}
		};
		
		//DESCENDENTE : LAMBDA *******
		Comparator<Integer> c1 = (o1, o2) -> o2 - o1;
		
		//DESCENDENTE : CLASE COMPARATOR *******
		Comparator<Integer> c3 = Comparator.reverseOrder();
		
		//ASCENDENTE *******
		Comparator<Integer> c2 = Comparator.naturalOrder();
		
		var list = Arrays.asList(5, 4, 7, 2);
		
		Collections.sort(list,c2); //ASCENDENTE
		Collections.reverse(list); //DESCENDENTE
		Collections.reverse(list); //ASCENDENTE
		
		System.out.println(Collections.binarySearch(list, 2)); //0

		
		

		
	}

}
