package com.simuladores.v3;

class SharedResource {
	private int count = 0;

	public synchronized void increment() {
		count++;
	}

	public synchronized void decrement() {
		count--;
	}

	public int getCount() {
		return count;
	}
}

class IncrementThread extends Thread {
	private SharedResource resource;

	public IncrementThread(SharedResource resource) {
		this.resource = resource;
	}

	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			resource.increment(); //INCREMENTA 1000 VECES
		}
	}
}

class DecrementThread extends Thread {
	private SharedResource resource;

	public DecrementThread(SharedResource resource) {
		this.resource = resource;

	}
	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			resource.decrement(); //DECREMENTA 1000 VECES
		}
	}
}

public class Main {
	public static void main(String[] args) throws InterruptedException {
		SharedResource resource = new SharedResource();
		Thread t1 = new IncrementThread(resource);
		Thread t2 = new DecrementThread(resource);
		t1.start();
		t2.start();
		t1.join(); //Hilo main se espera a que termine el hilo t1
		t2.join(); //Hilo main se espera a que termine el hilo t2
		System.out.println(resource.getCount()); //0
	}
}