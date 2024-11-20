package com.curso.v0;

public class Overloading2 {

	public static String overload(int i) {  //1
		return "1";
	}
	
	public static String overload(int... i) { //6
		return "2";
	}

	public static String overload(Integer i) { //3
		return "3";
	}

	public static String overload(long l) {  //2
		return "4";
	}

	public static String overload(Long L) {
		return "5";
	}
	
	public static String overload(Object o) { //5
		return "6";
	}
	
	public static String overload(Number n) { //4
		return "7";
	}

	public static void main(String[] args) {
		System.out.println("V2");
		System.out.println(overload(1));
		
		//Long l = 1;
	}

}
