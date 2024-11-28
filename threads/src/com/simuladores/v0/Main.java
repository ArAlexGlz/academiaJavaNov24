package com.simuladores.v0;

class MyThread implements Runnable {
	@Override
	public void run() {
		System.out.println("Thread is running");
	}
}

public class Main {
	public static void main(String[] args) {
		Thread t1 = new Thread(new MyThread());
		Thread t2 = new Thread(new MyThread());
		t1.start();
		t2.start();
	}
}
