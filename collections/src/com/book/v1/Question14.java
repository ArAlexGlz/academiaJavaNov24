package com.book.v1;

class W {} 
class X extends W {} 
class Y extends X {}

class Z<Y> { 
	W w1 = new W(); //SE PUEDE
	W w2 = new X(); //SE PUEDE
	//W w3 = new Y(); //NO SE PUEDE
	//Y y1 = new W(); //NO SE PUEDE
	//Y y2 = new X(); //NO SE PUEDE
	//Y y1 = new Y(); //NO SE PUEDE
}

public class Question14 {
	
	W w3 = new Y();
	//Y y1 = new W(); //NO SE PUEDE
	//Y y2 = new X(); //NO SE PUEDE
	Y y1 = new Y();

}
