package com.dic04.v0;

import java.util.TreeSet;

enum SIZE {
	TALL, GRANDE, JUMBO, ;
}

public class CoffeMug {
	public static void main(String[] args) {
		var hs = new TreeSet<SIZE>();
		hs.add(SIZE.TALL);
		hs.add(SIZE.JUMBO);
		hs.add(SIZE.GRANDE);
		hs.add(SIZE.TALL);
		hs.add(SIZE.TALL);
		hs.add(SIZE.JUMBO);
		for (SIZE s : hs)
			System.out.println(s);
	}
}