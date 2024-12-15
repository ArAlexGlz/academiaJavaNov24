package com.curso.v0;

import java.util.*;
import java.util.stream.Collectors;

public class Principal {
	
	private static Employee[] arrayOfEmps = { 
			new Employee(0, "Patrobas", 100.0), 
			new Employee(1, "Tercio", 200.0),
			new Employee(2, "Andronico", 300.0), 
			new Employee(3, "Epeneto", 400.0),
			new Employee(4, "Filologo", 500.0) };

	public static void main(String[] args) {
		//1.Filtrar los que ganan menos de 400
		//2.Incrementar su sueldo en 200	
		//3.Filtrar los que tengan una longitud mayor a 6 en su nombre	
		//4.Ordernar por nombre
		//5.Obtener una lista de los nombres: List<String> nombres
		
		List<Employee> lista = Arrays.asList(arrayOfEmps);
		
		List<String> listaNueva = lista.stream()
			.filter(emp -> emp.getSalary()<400)
			.peek(x -> x.setSalary(x.getSalary()+200))
			.filter(w -> w.getNombre().length()>6)
			.sorted(Comparator.comparing(Employee::getNombre))
			.map(z -> z.getNombre())
			.collect(Collectors.toList());
		
		listaNueva.forEach(System.out::println);
			
		
	}

}
