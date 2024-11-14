package com.curso.v1;

import java.util.LinkedList;
import java.util.List;

public class Principal2 {
	
	public static void main(String[] args) {
		List<Integer> list = new LinkedList<>(); 
		list.add(3); //3
		list.add(2); //3,2
		list.add(1); //3,2,1
		list.remove(2); //3,2 //<INDICE 
		list.remove(Integer.valueOf(2)); //3
		System.out.println(list);
	}

}
