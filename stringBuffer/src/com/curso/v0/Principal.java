package com.curso.v0;

public class Principal {
	
	public static void main(String[] args) {
		
		System.out.println("******StringBuffer******");
		
		//SE USA PRINCIPALMENTE CON EL MANEJO DE Threads (Hilos)
		StringBuffer sb = new StringBuffer("Hola");
		sb.append(" Mundo");        // "Hola Mundo"
		sb.insert(0, "¡");         // "¡Hola Mundo"
		sb.reverse();              // "odnuM aloH¡"
		sb.delete(0, 5);          // " aloH¡"
		sb.replace(0, 4, "Hi");   // "HiH¡"
		System.out.println("StringBuffer: "+sb);
		
		System.out.println("*****StringBuilder*******");
		
		StringBuilder sbu = new StringBuilder("Hola");
		sbu.append(" Mundo");        // "Hola Mundo"
		sbu.insert(0, "¡");         // "¡Hola Mundo"
		sbu.reverse();              // "odnuM aloH¡"
		sbu.delete(0, 5);          // " aloH¡"
		sbu.replace(0, 4, "Hi");   // "HiH¡"
		System.out.println("StringBuilder: "+sb);
		
		System.out.println("******StringBuffer******");
		
		//SE USA PRINCIPALMENTE CON EL MANEJO DE Threads (Hilos)
		sb = new StringBuffer("Hola");
		System.out.println(sb.append(" Mundo"));        // "Hola Mundo"
		System.out.println(sb.insert(0, "¡"));         // "¡Hola Mundo"
		System.out.println(sb.reverse());              // "odnuM aloH¡"
		System.out.println(sb.delete(0, 5));          // " aloH¡"
		System.out.println(sb.replace(0, 4, "Hi"));   // "HiH¡"
		System.out.println("StringBuffer: "+sb); // "HiH¡"
		
		
	}
	
	

}
