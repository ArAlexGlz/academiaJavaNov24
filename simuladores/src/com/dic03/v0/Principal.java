package com.dic03.v0;

interface Book {
	public default String getId() {
		return "ISBN123456";
	}
}

interface Encyclopedia extends Book {
	
	//abstract static String getName();

//	@Override
//	default String getId() {
//		return "AIN8888";
//	};

//	@Override
//	public default String getId() {
//		return "9999999999";
//	}

//	@Override
//	String getId();
	
//	static String getAuthor();
//	
//	default String getAuthor();

}

public class Principal {

}
