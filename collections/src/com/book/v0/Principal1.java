package com.book.v0;

import java.util.List;

public class Principal1 {

	public static void main(String[] args) {
		
		List<?> q = List.of("mouse", "parrot");
//		q.removeIf(String::isEmpty);
//		q.removeIf(s -> s.isEmpty());
//		q.removeIf(s -> s.length() == 5);

		var v = List.of("mouse", "parrot");
		v.removeIf(String::isEmpty);
		//v.removeIf(s -> s.isEmpty());
		v.removeIf(s -> s.length() == 5);
		
	}

}
