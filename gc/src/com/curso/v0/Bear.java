package com.curso.v0;

public class Bear {
	
	//Bear(){} //CONSTRUCTOR GENERADO POR LA JVM
	
	//VARIABLE DE INSTANCIA
    private Bear pandaBear; //<== OJO
    
    //MÉTODO DE INSTANCIA
    private void roar(Bear b) {
    	              //VARIABLE LOCAL
        System.out.println("Roar!");
        pandaBear = b; //<===
    }
    
    public static void main(String[] args) {
        Bear brownBear = new Bear(); //1
        Bear polarBear = new Bear(); //2
        brownBear.roar(polarBear);
        polarBear = null; //GC NO SE LLEVA EL OBJETO 
        brownBear = null; //GC PODRIA YA LLEVARSE LOS DOS OBJETOS
        System.gc();
    }
}