package com.luv2code.junitdemo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;

class EstudianteTest {
   private Estudiante estudiante;

   @BeforeEach
   void setUp() {
       estudiante = new Estudiante("Juan Pérez", 20, 8.5);
   }

   @Test
   void inscribirCurso_DeberiaAgregarCursoNuevo() {
       estudiante.inscribirCurso("Matemáticas");
       assertTrue(estudiante.getCursos().contains("Matemáticas"));
       assertEquals(1, estudiante.getCursos().size());
   }

   @Test
   void inscribirCurso_NoDuplicarCurso() {
       estudiante.inscribirCurso("Matemáticas");
       estudiante.inscribirCurso("Matemáticas");
       assertEquals(1, estudiante.getCursos().size());
   }

   @Test
   void evaluarBeca_EstudianteCalifica() {
       Estudiante estudianteSobresaliente = new Estudiante("María", 22, 9.5);
       assertTrue(estudianteSobresaliente.evaluarBeca());
       assertTrue(estudianteSobresaliente.isBecado());
   }

   @Test
   void evaluarBeca_EstudianteNoCalifica() {
       assertFalse(estudiante.evaluarBeca());
       assertFalse(estudiante.isBecado());
   }

   @Test
   void calcularCreditosTotales_ConMultiplesCursos() {
       estudiante.inscribirCurso("Matemáticas");
       estudiante.inscribirCurso("Física");
       estudiante.inscribirCurso("Química");
       assertEquals(12, estudiante.calcularCreditosTotales());
   }

   @Test
   void testConstructorYGetters() {
       assertEquals("Juan Pérez", estudiante.getNombre());
       assertEquals(20, estudiante.getEdad());
       assertEquals(8.5, estudiante.getPromedio());
       assertFalse(estudiante.isBecado());
       assertTrue(estudiante.getCursos().isEmpty());
   }

   @Test
   void testSetters() {
       estudiante.setNombre("Ana");
       estudiante.setEdad(21);
       estudiante.setPromedio(9.0);
       estudiante.setBecado(true);
       estudiante.setCursos(Arrays.asList("Biología", "Química"));

       assertEquals("Ana", estudiante.getNombre());
       assertEquals(21, estudiante.getEdad());
       assertEquals(9.0, estudiante.getPromedio());
       assertTrue(estudiante.isBecado());
       assertEquals(2, estudiante.getCursos().size());
   }
   
   @Test
   void evaluarBeca_TestTodosCasos() {
       // Caso 1: Promedio alto y edad válida
       Estudiante e1 = new Estudiante("Test1", 25, 9.0);
       assertTrue(e1.evaluarBeca());

       // Caso 2: Promedio alto pero edad mayor
       Estudiante e2 = new Estudiante("Test2", 26, 9.0);
       assertFalse(e2.evaluarBeca());

       // Caso 3: Edad válida pero promedio bajo
       Estudiante e3 = new Estudiante("Test3", 25, 8.9);
       assertFalse(e3.evaluarBeca());

       // Caso 4: Ambas condiciones falsas
       Estudiante e4 = new Estudiante("Test4", 26, 8.9);
       assertFalse(e4.evaluarBeca());
   }
}