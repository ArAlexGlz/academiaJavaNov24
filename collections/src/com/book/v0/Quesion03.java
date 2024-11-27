package com.book.v0;

import java.util.ArrayDeque;

public class Quesion03 {

	public static void main(String[] args) {

		var greetings = new ArrayDeque<String>();
		
		boolean r = greetings.offerLast("hello");
		//System.out.println(r);
		greetings.offerLast("hi");
		
		greetings.offerFirst("ola");
		
		String s1 = greetings.pop(); //[hello, hi]
		
		//System.out.println(s1);
		
		s1 = greetings.peek(); //[hello, hi]
		
		//System.out.println(s1); //hello
		
//		if (greetings.peek() != null) 
//			System.out.print(greetings.pop()); //hello
//		
//		System.out.println(greetings); //[hi]
		
		while (greetings.peek() != null)  //hello, hi
			System.out.print(greetings.pop()); //hellohi
		
		System.out.println(greetings); //[]
		
		

		
	}

}
