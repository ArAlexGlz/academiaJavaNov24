package com.curso.docto.v0;

public class Main {
	
    public static void main(String[] args) throws Exception {
        doSomething();
        
        System.out.println("FIN DE PROGRAMA");
    }

    private static void doSomething() throws Exception {
        System.out.println("Before if clause");
        if (Math.random() > 0.5) {
            throw new Exception();
        }
        System.out.println("After if clause");
    }
}
//1er Escenario random =< 0.5
//Before if clause
//After if clause
//FIN DE PROGRAMA

//2do Escenario random > 0.5
//Before if clause
//Programa se desborda

