package com.luv2code.junitdemo;

import java.util.ArrayList;
import java.util.List;

public class Estudiante {
   private String nombre;
   private int edad;
   private double promedio;
   private List<String> cursos;
   private boolean becado;

   // Constructor
   public Estudiante(String nombre, int edad, double promedio) {
       this.nombre = nombre;
       this.edad = edad;
       this.promedio = promedio;
       this.cursos = new ArrayList<>();
       this.becado = false;
   }

   // Métodos específicos
   public void inscribirCurso(String curso) {
       if (!cursos.contains(curso)) {
           cursos.add(curso);
       }
   }

   public boolean evaluarBeca() {
       if (promedio >= 9.0 && edad <= 25) {
           this.becado = true;
           return true;
       }
       return false;
   }

   public int calcularCreditosTotales() {
       return cursos.size() * 4; // Asumiendo 4 créditos por curso
   }

   // Getters y Setters
   public String getNombre() {
       return nombre;
   }

   public void setNombre(String nombre) {
       this.nombre = nombre;
   }

   public int getEdad() {
       return edad;
   }

   public void setEdad(int edad) {
       this.edad = edad;
   }

   public double getPromedio() {
       return promedio;
   }

   public void setPromedio(double promedio) {
       this.promedio = promedio;
   }

   public List<String> getCursos() {
       return cursos;
   }

   public void setCursos(List<String> cursos) {
       this.cursos = cursos;
   }

   public boolean isBecado() {
       return becado;
   }

   public void setBecado(boolean becado) {
       this.becado = becado;
   }
}