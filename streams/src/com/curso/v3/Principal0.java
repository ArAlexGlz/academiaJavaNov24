package com.curso.v3;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Principal0 {

	public static void main(String[] args) {

		Stream<Integer> stream1 = Stream.of(1, 2, 3);
		
		int res = stream1.reduce(0, (s, n) -> s + n);

		System.out.println(res); 
		
		System.out.println("****IntStream****");
		
		Stream<Integer> stream2 = Stream.of(1, 2, 3);

		// Stream<Integer> ===>>> IntStream
		IntStream intStream2 = stream2.mapToInt(x -> x);
		
		System.out.println(intStream2.sum());
		
		System.out.println("****IntStream****");

		Stream<Integer> stream3 = Stream.of(1,2,3,4,5,6,7,8,9);

		// Stream<Integer> ===>>> IntStream
		IntStream intStream3 = stream3.mapToInt(x -> x);
		
		IntSummaryStatistics iss = intStream3.summaryStatistics();
		
		System.out.println("getMax: "+iss.getMax());
		System.out.println("getMin: "+iss.getMin());
		System.out.println("getAverage: "+iss.getAverage());
		System.out.println("getCount: "+iss.getCount());
		System.out.println("getSum: "+iss.getSum());



		
		
	}

}
