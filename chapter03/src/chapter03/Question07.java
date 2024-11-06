package chapter03;

public class Question07 {
	
	public static void main(String patitos[]) {
		
		//                                0,1,2,3,4
		//new Question07().print6(new int[]{1,2,3,4,5});
		
		int i = 1;
		for (;;) {
			System.out.println("i: "+i);
			i++;
			if (i>10)
				break;
		}
	}

	private void print1(int[] weather) {
		//      i=4               
		for(int i=weather.length-1; i>=0; i--) { 
			System.out.println(weather[i]); 
		} 
	}
	
	private void print2(int[] weather) {              
		for(int i=0; i <= weather.length-1; ++i) { 
			System.out.println(weather[i]); 
		} 
	}
	
	private void print3(int[] weather) {              
		for(var w : weather) { 
			System.out.println(w); 
		} 
	}
	
	private void print4(int[] weather) {              
		for(int i=weather.length-1; i>=0; --i) { 
			System.out.println(weather[i]); 
		} 
	}
	
	private void print5(int[] weather) {              
		for(int i=0, j=3; i<weather.length; ++i,j--) { 
			System.out.println(weather[i]); 
			System.out.println("j: "+ ++j);
		} 
	}
	
	private void print6(int[] weather) {  
		//            0<10  && 0<5
		for(int i=-1; ++i<10 && i<weather.length;  ) { 
			System.out.println(weather[i]); 
		} 
	}
	
}
