package com.dic04.v0;

public enum Card {
	
	HEART, CLUB, SPADE, DIAMOND;
	
	public static void main(String[] args) {
		
		//Card[] arreglo = Card.values();
		
		for(Card c : Card.values()) 
			System.out.print(c+" ");
		
//		while(Card.hasNext()) 
//			System.out.println(Card.next()+" ");
//		
//		for(int i=0; i<4; i++) 
//			System.out.println(Card[i]+" ");
	}

}
