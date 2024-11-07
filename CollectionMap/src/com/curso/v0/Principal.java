package com.curso.v0;
import java.util.*;

public class Principal {

	public static void main(String[] args) {

		//List,Set,Queue(FIFO & LIFO)
		//Map (key,value)
		
		Map<Integer,String> map = new HashMap<>();
		
		map.put(1,"Uno");
		map.put(2,"Dos");
		map.put(1,"One");
		map.put(2,"Two");
		map.put(100, "One");
		
		map.entrySet().forEach(
				x -> System.out.println("clave:"+x.getKey()+
						                " valor: "+x.getValue()));
		System.out.println("***************");
		
		Map<String,Integer> map2 = new HashMap<>();
		
		map2.put("Uno",1);
		map2.put("Dos",2);
		map2.put("One",1);
		map2.put("Two",2);
		map2.put("One",100);
		
		map2.entrySet().forEach(
				x -> System.out.println("clave:"+x.getKey()+
						                " valor: "+x.getValue()));
	}

}
