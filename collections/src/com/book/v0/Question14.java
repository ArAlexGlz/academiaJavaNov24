package com.book.v0;

class W {} 
class X extends W {} 
class Y extends X {}

public class Question14 {
	W w = new Y();
	X x = new Y();
	//Y y = new X(); //NO SE PUEDE
}
