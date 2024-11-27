package com.book.v0;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Question04 {

	public static void main(String[] args) {
		
		HashSet<Number> hs0 = new HashSet<Number>();
		
		HashSet<? extends Number> hs1 = 
				new HashSet<Integer>();
		
		HashSet<? super ClassCastException> set = 
				new HashSet<Exception>();
		
		List<String> list = new ArrayList<>();
		
		Set<Object> values = new HashSet<Object>();
		
		List<? extends Object> objects = 
				new ArrayList<StringBuilder>();
		
		Map<String, ? extends Number> hm = 
				new HashMap<String, Float>();
		
	}

}
