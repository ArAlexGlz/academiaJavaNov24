package com.curso.v0;

class Vehiculo {
    String tipo;
    
    Vehiculo() {
        this("Desconocido");
        System.out.println("Constructor sin argumentos de Vehiculo");
    }
    
    Vehiculo(String tipo) {
        this.tipo = tipo;//2
        System.out.println("Constructor con argumento de Vehiculo");
    }
}

public class Auto extends Vehiculo {
    Auto() {
        super("Automóvil"); //1
        System.out.println("Constructor de Auto");
    }

    public static void main(String[] args) {
        new Auto();
    }
}
//"Constructor con argumento de Vehiculo"
//"Constructor de Auto"