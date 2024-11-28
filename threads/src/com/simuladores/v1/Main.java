package com.simuladores.v1;

class MyThread extends Thread {
	@Override
	public void run() {
		System.out.println("Thread is running: "+Thread.currentThread().getName());
	}
}

public class Main {
	public static void main(String[] args) {
		System.out.println("INICIO PROGRAMA: "+Thread.currentThread().getName());
		Thread t1 = new MyThread();
		Thread t2 = new MyThread();
		t1.setName("t1");
		t2.setName("t2");
		t1.start();
		t2.start();
		System.out.println("FIN PROGRAMA: "+Thread.currentThread().getName());
	}
}
