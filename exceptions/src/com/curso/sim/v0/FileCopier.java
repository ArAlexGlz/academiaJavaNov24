package com.curso.sim.v0;

import java.io.*;

public class FileCopier {
	
	public static void main(String[] args) throws FileNotFoundException {
		copy("c:\\temp\\test1.txt", "c:\\temp\\test2.txt"); 
	}

	private static void copy(String records1, String records2) throws FileNotFoundException  {
		
		InputStream is = new FileInputStream(records1); 
		
		OutputStream os = new FileOutputStream(records2); 

		
	}

}
