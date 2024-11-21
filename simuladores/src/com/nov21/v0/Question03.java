package com.nov21.v0;

import java.util.ArrayDeque;

public class Question03 {
	
	public static void main(String[] args) {
		var greetings = new ArrayDeque<String>();
		System.out.println(greetings);
		greetings.offerLast("hello");
		System.out.println(greetings);
		greetings.offerLast("hi");
		System.out.println(greetings);
		greetings.offerFirst("ola");
		System.out.println(greetings);
		String g = greetings.pop();
		System.out.println(g);
		System.out.println(greetings);
		g = greetings.peek();
		System.out.println(g);
		System.out.println(greetings);
		
		while (greetings.peek() != null) 
			System.out.print(greetings.pop());
		//hellohi

	}

}
