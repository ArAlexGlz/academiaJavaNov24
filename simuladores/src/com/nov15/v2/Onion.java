package com.nov15.v2;

public class Onion {
	
	private String data = "skin";
	
	//CLASE ANIDADA DE INSTACINA
	private class Layer extends Onion {
		//Hidden
		String data = "thegoodpart";
		
		public String getData(){
			return data;
		}
		public static void main(String[] args) {
			Onion o = new Onion();
						
			System.out.println(o.getData());
		}
	}
	
	public String getData(){
		return new Layer().getData();
	}
	

	

}
