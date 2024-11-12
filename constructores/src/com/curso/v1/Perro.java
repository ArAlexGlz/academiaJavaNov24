package com.curso.v1;

class Animal {
    String nombre;
    
    Animal() {
        this("Animal genérico");
        System.out.println("Constructor sin argumentos de Animal");
    }
    
    Animal(String nombre) { //4
        this.nombre = nombre;
        System.out.println("Constructor con argumento de Animal: " + nombre);
    }
}

class Mamifero extends Animal {
    Mamifero() {
        this("Mamífero genérico");
        System.out.println("Constructor sin argumentos de Mamifero");
    }
    
    Mamifero(String nombre) { //3
        super(nombre);
        System.out.println("Constructor con argumento de Mamifero: " + nombre);
    }
}

public class Perro extends Mamifero {
    Perro() {  //2
        super("Perro");
        System.out.println("Constructor sin argumentos de Perro");
    }

    Perro(String nombre) {//1
        this();
        System.out.println("Constructor con argumento de Perro: " + nombre);
    }

    public static void main(String[] args) {
        new Perro("Firulais");
    }
}
//Constructor con argumento de Animal:
//Constructor con argumento de Mamifero: 
//Constructor sin argumentos de Perro
//Constructor con argumento de Perro:

