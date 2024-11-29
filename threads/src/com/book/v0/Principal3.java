package com.book.v0;

public class Principal3 {

	public static void main(String[] args) {

		Runnable printInventory = 
				() -> System.out.println("Printing zoo inventory");
		
		Runnable printRecords = 
				() -> {

					for (int i = 0; i < 3; i++)

						System.out.println("Printing record: " + i);

				};
				
		System.out.println("begin"); //Thread main
		
		new Thread(printInventory).run(); //Thread main
		
		new Thread(printRecords).run(); //Thread main
		
		new Thread(printInventory).run(); //Thread main
		
		System.out.println("end"); //Thread main
	}

}
