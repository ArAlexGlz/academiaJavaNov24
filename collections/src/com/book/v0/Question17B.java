package com.book.v0;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Question17B {
	
	public static void main(String[] args) {
		
//		Map<Integer,Integer> map =  new HashMap<>();
//		map.put(1, 2);
//		map.put(3, 6);
		
		var map = Map.of(1,2, 3, 6);
		
		//--------------------------------------
		
		//Set<Map.Entry<Integer,Integer>> setmap = map.entrySet();
		//List<<Map.Entry<Integer,Integer>> list
		
		var list = List.copyOf(map.entrySet());
		
//		for (Map.Entry<Integer,Integer> mapentry :list) {
//			System.out.print("Key: "+mapentry.getKey());
//			System.out.println(" Value: "+mapentry.getValue());
//		}
		
		//List<<Map.Entry<Integer,Integer>> INMUTABLE
//		list.replaceAll(x -> {
//				x.setValue(x.getValue()*2);
//				return x;
//			}
//		);
		
		System.out.println("list: "+list); //{1=2,3=6}
		
		//--------------------------------------

		List<Integer> one = List.of(8, 16, 2);
		//one.replaceAll(x -> x * 2); INMUTABLE
		
		//List<Integer> copy
		var copy = List.copyOf(one);
		
		//List<Integer> copyOfCopy
		var copyOfCopy = List.copyOf(copy);
		
		//System.out.println(copyOfCopy.getClass().getName());
		
		//ArrayList<Integer> thirdCopy
		var thirdCopy = new ArrayList<>(copyOfCopy);
		
		System.out.println(thirdCopy.getClass().getName());
		
		thirdCopy.replaceAll(x -> x * 2);
		System.out.println(thirdCopy); //[16,32,4]
		
		
		
		
	}

}
