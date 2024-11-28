package com.simuladores.v0;

public class Bees {

	public static void main(String[] args) {
		try {
			new Bees().go();
		}
		catch(Exception e){
			System.out.println("thrown to main");
		}
		//1 
		//thrown to main
		System.out.println("FIN DE PROGRAMA");
	}
	
	synchronized void go() throws InterruptedException{
		Thread t1 = new Thread();
		t1.start(); //Hilo t1
		System.out.println("1"); //Hilo main
		t1.wait(5000); //Hilo t1 (Espera 5 Segundos)
		System.out.println("2");
	}

}
