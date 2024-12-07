package com.dic05.v0;

import java.io.IOException;
import java.util.*;

public class Wildcard {

	public void showSize(List<?> list) {
		System.out.println(list.size());
	}

	public static void main(String[] args) {

		Wildcard card = new Wildcard();
		
//		List<?> miLista = new ArrayList<String>();
//		miLista = new LinkedList<Float>();
		
		//ArrayList<? super Date> list = new ArrayList<Date>();
		
		//List<Exception> list = new LinkedList<java.io.IOException>();
		
		ArrayList <? extends Number> list = new ArrayList <Integer>();

		card.showSize(list);
	}
}