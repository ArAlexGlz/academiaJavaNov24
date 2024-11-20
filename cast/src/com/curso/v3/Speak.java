package com.curso.v3;

interface Truth{
	public void tellItLikeItIs();
}

class Tell extends Speak implements Truth{
	@Override
	public void tellItLikeItIs() {
		System.out.println("Right on!");
	}
}


public class Speak {

	public static void main(String[] args) {
		
		Speak speakIt = new Tell();
		Tell tellIt = new Tell();
		
		//speakIt.tellItLikeItIs(); //ERROR COMPILATION (L17)
		
		//(Truth)speakIt.tellItLikeItIs(); //ERROR COMPILATION (L18)
		
		((Truth)speakIt).tellItLikeItIs();
		
		tellIt.tellItLikeItIs();
		
		((Truth)tellIt).tellItLikeItIs();
	}

}


