package com.dic06.v1;

public class StringConcatenationTest {

	public static void main(String[] args) {
	       String str1 = "Hello";
	       String str2 = "World";
	       String str3 = str1 + " " + str2;
	       String str4 = str1.concat(" ").concat(str2);
	       String str5 = 
	    	 new StringBuilder().append(str1).append(" ").append(str2).toString();

	       System.out.println(str1.equals(str2) + " ");
	       System.out.println(str3.equals(str4) + " ");
	       System.out.println(str3 == str5 + " ");
	       System.out.println(str4 == str5);
	    }

}
