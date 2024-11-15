package com.nov15.v1;

public class Onion {
	
	private String data = "skin";
	
	//CLASE ANIDADA DE INSTACINA
	private class Layer extends Onion {
		//Hidden
		String data = "thegoodpart";
		
		public String getData(){
			return data;
		}
	}
	
	public String getData(){
		return new Layer().getData();
	}
	
	public static void main(String[] args) {
		Onion o = new Onion();
		
		//System.out.println(o.data);
		
		System.out.println(o.getData());
	}
	

}
