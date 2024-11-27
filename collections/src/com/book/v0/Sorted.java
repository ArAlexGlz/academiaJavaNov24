package com.book.v0;

import java.util.Comparator;
import java.util.TreeSet;

public class Sorted implements Comparable<Sorted>,Comparator<Sorted>{

	int num;
	String text;

	public Sorted(int num, String text) {
		this.num = num;
		this.text = text;
	}

	int num() {
		return num;
	}

	String text() {
		return text;
	}

	public String toString() {
		return text+ ":" + num;
	}

	@Override //Comparable
	public int compareTo(Sorted s) {
		return text.compareTo(s.text);
	}

	@Override //Comparator
	public int compare(Sorted s1, Sorted s2) {
		return s1.num - s2.num;
	}
	
	public static void main(String[] args) {
		
		var s1 = new Sorted(88, "a"); 
		var s2 = new Sorted(55, "b");
		
		var t1 = new TreeSet<Sorted>(); //Comparable
		t1.add(s1); t1.add(s2);
		//88,55   //a, b
		
		var t2 = new TreeSet<Sorted>(s2); //Comparator
		t2.add(s1); 
		t2.add(s2); //55,88  //b,a
		
		System.out.println(t1 + " " + t2);
		//                 [88,55] [55,88]
		
		
	}

}
