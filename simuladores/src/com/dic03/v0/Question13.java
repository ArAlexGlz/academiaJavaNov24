package com.dic03.v0;

interface IHello {
	public int hello(int x, int y);

	public long hello(long x, long y);
}

abstract class Hello implements IHello {
	@Override
	public int hello(int a, int b) {
		return 0;
	}
}

//abstract class Hello implements IHello {
//	
//	public short hello(short a, short b) {
//		return 0;
//	}
//}
//
//interface IHello2 extends IHello{ }

//interface iHello2 implements IHello{ }

//abstract class Hello implements IHello{}

//Which of the following options are valid definitions in a different file assuming that the above definition is already available?

public class Question13 {

	public static void main(String[] args) {

	}

}
