package com.book.v0;

import java.util.ArrayList;
import java.util.List;

public class Principal2 {

	public static void main(String[] args) {
		
		var v = List.of("mouse", "parrot");
		
		ArrayList<String> w = new ArrayList<>(v);
		
		w.removeIf(s -> s.length() == 5);
		
		System.out.println(w);
		
		
		
	}

}
