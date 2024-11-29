package com.book.v1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Principal2 {

	public static void main(String[] args) {

		Runnable printInventory = 
				() -> System.out.println("Printing zoo inventory");
		
		Runnable printRecords = 
				() -> {

					for (int i = 0; i < 1000; i++)

						System.out.println("Printing record: " + i);

				};
				
		ExecutorService service = Executors.newFixedThreadPool(3);
		
		System.out.println("begin");
		
		service.execute(printInventory);

		service.execute(printRecords); 
		
		service.execute(printInventory); 
		
		System.out.println("end");
		
		service.shutdown();

	}

}
