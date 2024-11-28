package com.book.v0;

import java.util.*;

public class Question15 {

	public static void main(String[] args) {

		var q = new LinkedList<>(); //FIFO
		
		q.add(10);
		q.add(12); 
		q.remove(1); 
		
		System.out.print(q);
	}

}
