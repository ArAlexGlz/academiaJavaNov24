package com.simuladores.v1;

public class TestClass {
	
	class Runner implements Runnable {
		@Override
		public void run() {
			Thread[] t = new Thread[5]; //Array 5 Threads
			for (int i = 0; i < t.length; i++)
				System.out.println(t[i]); //
		}
	}

	public static void main(String args[]) throws Exception {
		System.out.println("V1");
		
		TestClass tc = new TestClass();
		
		new Thread(tc.new Runner()).start();
	}
}