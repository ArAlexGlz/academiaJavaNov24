package com.nov21.v0;

import java.util.*;

public class Question02 {

	public static void main(String[] args) {
		
		List<?> q = List.of("mouse", "parrot");
		List<?> qq = new ArrayList<>(q);
		
		var v = List.of("mouse", "parrot");
		var vv = new ArrayList<>(v);
		
		for (Object o:q)
			System.out.println(o);
		
		for (String o:v)
			System.out.println(o);
		
		System.out.println("********");
		
		vv.removeIf(x -> x.length() == 6);
		System.out.println(vv);
		
//		qq.removeIf(x -> x.length() == 6);
//		System.out.println(qq);

	}

}
