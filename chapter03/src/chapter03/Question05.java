package chapter03;

import java.util.ArrayList;
import java.util.List;

public class Question05 {

	public static void main(String[] args) {
		List<Integer> myFavoriteNumbers = new ArrayList<>();
		myFavoriteNumbers.add(10);
		myFavoriteNumbers.add(14);

		for (Integer a : myFavoriteNumbers) {
			System.out.print(a + ", ");
			break;
		}
		System.out.println("*****");
		for (int b : myFavoriteNumbers) {
			System.out.print(b + ", ");
			continue;
		}
		System.out.println("*****");
		for (Object c : myFavoriteNumbers) 
			System.out.print(c + ", ");

	}

}
