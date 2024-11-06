package chapter03;

import java.util.List;

public class Question03 {

	public static void main(String[] args) {

		Double[][] doubles = {{1.0,2.0},{3.0,4.0},{5.0,6.0},{7.0,8.0}};
		
		for (int x=0;x < doubles.length; x++) 
			for (int y=0;y < doubles[x].length; y++) 
				System.out.println(doubles[x][y]);
		
		System.out.println("************");
		
		for (Double[] array:doubles)
			for (double d: array)
				System.out.println(d);
		
//		System.out.println("************");
//
//		for (Double[] array:doubles)
//			List.of(array).forEach(System.out::println);
//		
		
		//Object o = new Object();
		
		//for (     :o)
		
		
	}

}
