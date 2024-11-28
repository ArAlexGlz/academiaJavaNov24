package com.nov28.v0;

import java.text.NumberFormat;

public class NumberConverter {
	
    public static void main(String[] args) {
        // Crear instancia de NumberFormat
        NumberFormat nf = NumberFormat.getInstance();
        nf.setMaximumFractionDigits(3);

        // Ejemplos de números para convertir
        double numero1 = 1234.56789;
        double numero2 = 9876.54321;
        int numero3 = 1000000;
        float numero4 = 3.14159f;

        // Convertir números a String y mostrar resultados
        String resultado1 = nf.format(numero1);
        String resultado2 = nf.format(numero2);
        String resultado3 = nf.format(numero3);
        String resultado4 = nf.format(numero4);

        // Mostrar resultados
        System.out.println("Número original: " + numero1 + " -> Convertido: " + resultado1);
        System.out.println("Número original: " + numero2 + " -> Convertido: " + resultado2);
        System.out.println("Número original: " + numero3 + " -> Convertido: " + resultado3);
        System.out.println("Número original: " + numero4 + " -> Convertido: " + resultado4);
    }
}
