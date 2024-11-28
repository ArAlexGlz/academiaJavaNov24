package com.book.v0;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Question17A {
	
	public static void main(String[] args) {
		
		Map<Integer,Integer> mapa =  new HashMap<>();
		mapa.put(1, 2);
		mapa.put(3, 6);
		
		System.out.println(mapa); //{1=2,3=6}
		
		Set<Map.Entry<Integer,Integer>> setmap = mapa.entrySet();
		
		System.out.println("**********");
		
		for (Map.Entry<Integer,Integer> mapentry :setmap){
			System.out.println(mapentry);
			//System.out.println(mapentry.getClass().getName());
			System.out.println("Key: "+mapentry.getKey());
			System.out.println("Value: "+mapentry.getValue());
			System.out.println("--------------");
		}
		
	}

}
