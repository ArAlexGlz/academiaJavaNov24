package com.academia.rest;

public class Empleado {

    private int id;
    private String nombre;
    private String apellido;
    private String email;
    private double salario;

    public Empleado() {
    }

    public Empleado(int id, String nombre, String apellido, String email, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.salario = salario;
    }

    public Empleado(long andIncrement, String nombre, String apellido) {
        id = (int)andIncrement;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
