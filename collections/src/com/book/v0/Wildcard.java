package com.book.v0;

import java.util.*;

public class Wildcard {
	
	public void showSize(List<?> list) { 
		System.out.println(list.size());
	}
	
	public static void main(String[] args) {
		Wildcard card = new Wildcard();
		
		//List<?> list = new HashSet<String>()
		
		//ArrayList<? super Date> list = new ArrayList<Date>();
		
		//List<?> list = new ArrayList<?>();
		
//		List<Exception> list = 
//				new LinkedList<Exception>();
		
		ArrayList <? extends Number> list = 
				new ArrayList <Integer>();
		
		card.showSize(list);
	}

}
