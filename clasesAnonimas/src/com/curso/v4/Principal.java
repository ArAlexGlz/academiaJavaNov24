package com.curso.v4;

public class Principal {
	
	public static void main(String[] args) {
		System.out.println("V4");
		
		boolean bRes;
		
		Predicado<String> pre1 = new Concluye();
		
		bRes = pre1.probar("Hellox");
		
		System.out.println(bRes);
		
		System.out.println("**********");
		
		Predicado<String> pre2 = new Predicado<>() {
			@Override
			public boolean probar(String cadena) {
				return cadena.endsWith("z");
			}
		};
		
		bRes = pre2.probar("Helloxz");
		
		System.out.println(bRes);
		
		System.out.println("**********");
		
		Predicado<Integer> pre3 = new Predicado<>() {
			@Override
			public boolean probar(Integer i) {
				return i%2==0;
			}
		};
		
		bRes = pre3.probar(999);
		
		System.out.println(bRes);
		
	}

}
