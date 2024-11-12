package com.curso.v1;

class Vehiculo {
    String tipo;
    
    Vehiculo() { //4
        super();
        System.out.println("Constructor sin argumentos de Vehiculo");
    }
    
    Vehiculo(String tipo) { //3
    	this();
        this.tipo = tipo;
        System.out.println("Constructor con argumento de Vehiculo");
    }
}

public class Auto extends Vehiculo {
	Auto(String tipo) { //2
        super("Automóvil"); 
        System.out.println("Constructor de Auto con un argumento");
    }
    Auto() { //1
        this("Automóvil"); 
        System.out.println("Constructor de Auto sin argumentos");
    }

    public static void main(String[] args) {
        new Auto();
    }
}
//Constructor sin argumentos de Vehiculo
//Constructor con argumento de Vehiculo
//Constructor de Auto con un argumento
//Constructor de Auto sin argumentos


