package com.simuladores.v0;

public class TestClass extends Thread {
	
//	public void run() {
//		System.out.println("Hola");
//	}
//	
	class Runner implements Runnable {
		@Override
		public void run() {
			Thread[] t = new Thread[5]; //Array 5 Threads
			for (int i = 0; i < t.length; i++)
				System.out.println(t[i]); //
		}
	}

	public static void main(String args[]) throws Exception {
		TestClass tc = new TestClass();
		//tc.start();
		
		new Thread(tc.new Runner()).start();
	}
}