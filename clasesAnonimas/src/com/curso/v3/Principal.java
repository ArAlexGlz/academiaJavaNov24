package com.curso.v3;

public class Principal {
	
	public static void main(String[] args) {
		
		boolean bRes;
		
		Predicado pre1 = new Concluye();
		
		bRes = pre1.probar("Hellox");
		
		System.out.println(bRes);
		
		System.out.println("**********");
		
		Predicado pre2 = new Predicado() {
			@Override
			public boolean probar(String cadena) {
				return cadena.endsWith("z");
			}
		};
		
		bRes = pre2.probar("Helloxz");
		
		System.out.println(bRes);
		
	}

}
