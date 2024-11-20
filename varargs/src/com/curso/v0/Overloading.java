package com.curso.v0;

public class Overloading {

	public static String overload(String s) {
		return "1";
	}

	public static String overload(String... s) {
		return "2";
	}
	
//	public static String overload(String[] s) {
//		return "2A";
//	}

	public static String overload(Object o) {
		return "3";
	}

	public static String overload(String s, String t) {
		return "4";
	}

	public static void main(String[] args) {
		
		//System.out.println(overload("a")); //1
		//System.out.println(overload("a", "b"));
		//System.out.println(overload("a", "b", "c"));
		System.out.println(overload());
		
	}

}
