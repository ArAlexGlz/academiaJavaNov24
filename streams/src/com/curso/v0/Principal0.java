package com.curso.v0;

import java.util.stream.Stream;

public class Principal0 {

	public static void main(String[] args) {

		Stream<Integer> oddNumberUnder100 = Stream.iterate(
				1, //Valor Inicial
				n -> n < 100, //Limite
				n -> n + 2); //Incremento (1,3,5,7,9....97,99)
		
		
		oddNumberUnder100
			.filter(value -> value%9 == 0)
			.forEach(valor -> System.out.println(valor));
		
	}

}
