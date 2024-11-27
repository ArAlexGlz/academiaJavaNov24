package com.book.v0;

import java.util.List;

public class Principal0 {

	public static void main(String[] args) {
		
		//List<String> q = List.of("mouse", "parrot");
		//q.add("perico");
		//q.remove(0);
		
		List<?> q = List.of("mouse", "parrot");
		//System.out.println(q.get(1));
		//q.add("perico");
		
		//??? q = List<String> NO
		//String s1 = q.get(1);
		
		//q = List<Object> SI
		Object o1 = q.get(1);
		
		var v = List.of("mouse", "parrot");
		//??? v = List<String> SI
		String s2 = v.get(1);
		System.out.println(s2);
		
		//v = List<Object> SI
		Object o2 = v.get(1);
		
		//List<?> lo = v;
		
	}

}
