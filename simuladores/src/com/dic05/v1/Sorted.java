package com.dic05.v1;

import java.util.Comparator;
import java.util.TreeSet;

public class Sorted implements Comparable<Sorted> {
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
	
	public String toString() { return "" + num; }
	
	

	public static void main(String[] args) {
		//Sorted s0 = new Sorted(77, "z"); 
		Sorted s1 = new Sorted(88, "a"); 
		Sorted s2 = new Sorted(55, "b");
		
		var t1 = new TreeSet<Sorted>();
		t1.add(s1); t1.add(s2);
		
		//System.out.println(t1); //88,55,77
		
		var t2 = new TreeSet<Sorted>(
				(e1, e2) -> s1.num - s2.num);
		
		t2.add(s1); t2.add(s2);
		
		//System.out.println(t2); //55,77,88
		
		System.out.println(t1 + " " + t2);
		
	}

}
