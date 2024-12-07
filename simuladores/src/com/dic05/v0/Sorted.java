package com.dic05.v0;

import java.util.Comparator;
import java.util.TreeSet;

public class Sorted implements Comparable<Sorted>, 
								Comparator<Sorted> {
	int num; 
	String text;

	public Sorted(int num, String text) {
		this.num = num;
		this.text = text;
	}

	//Comparable<Sorted>
	public int compareTo(Sorted s) {
		return text.compareTo(s.text);
	}
	
	//Comparator<Sorted>
	public int compare(Sorted s1, Sorted s2) {
		return s1.num - s2.num;
	}
	
	public String toString() { return "" + num; }
	
	

	public static void main(String[] args) {
		//Sorted s0 = new Sorted(77, "z"); 
		Sorted s1 = new Sorted(88, "a"); 
		Sorted s2 = new Sorted(55, "b");
		
		var t1 = new TreeSet<Sorted>();
		t1.add(s1); t1.add(s2);
		
		//System.out.println(t1); //88,55,77
		
		var t2 = new TreeSet<Sorted>(new Sorted(8888,"zzzzz"));
		t2.add(s1); t2.add(s2);
		
		//System.out.println(t2); //55,77,88
		
		System.out.println(t1 + " " + t2);
		
	}

}
