package com.book.v0;

import java.util.HashMap;

public class Question19 {

	public static void main(String[] args) {

		
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();

		map.put(1, 10);
		map.put(2, 20);
		map.put(3, null);
		
		map.merge(1, 3, (a, b) -> a + b); //(1,13)
		map.merge(3, 3, (a, b) -> a + b); //(3,3)
		System.out.println(map); // {1=13,2=20,3=3}
	}

}
