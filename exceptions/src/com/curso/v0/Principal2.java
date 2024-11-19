package com.curso.v0;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Principal2 {

	public static void main(String[] args) {

		try {
			FileReader archivo = new FileReader("tarea.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println("FIN DE PROGRAMA");
		
	}

}
