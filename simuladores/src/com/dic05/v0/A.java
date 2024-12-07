package com.dic05.v0;

class A {
	private int i;

	public void modifyOther(A a1) {
		a1.i = 20; // 1
		System.out.println(a1.i);
		System.out.println(i);
	}
	
	public static void main(String[] args) {
		new A().modifyOther(new A());
	}
}
