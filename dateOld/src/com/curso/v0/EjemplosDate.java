package com.curso.v0;

import java.util.Date;
import java.text.SimpleDateFormat;

public class EjemplosDate {
    public static void main(String[] args) {
        // Crear una fecha con la hora actual
        Date fechaActual = new Date();
        System.out.println("Fecha actual: " + fechaActual);
        
        // Crear una fecha específica (deprecated, pero aún funcional)
        Date fecha1 = new Date(2024 - 1900, 0, 1); // 1 de enero de 2024
        System.out.println("Fecha específica: " + fecha1);
        
        // Formatear una fecha
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String fechaFormateada = formato.format(fechaActual);
        System.out.println("Fecha formateada: " + fechaFormateada);
        
        // Comparar fechas
        Date fecha2 = new Date();
        System.out.println("fecha1 es anterior a fecha2: " + fecha1.before(fecha2));
        System.out.println("fecha1 es posterior a fecha2: " + fecha1.after(fecha2));
        
        // Obtener timestamp en milisegundos
        long tiempoMilis = fechaActual.getTime();
        System.out.println("Tiempo en milisegundos: " + tiempoMilis);
    }
}