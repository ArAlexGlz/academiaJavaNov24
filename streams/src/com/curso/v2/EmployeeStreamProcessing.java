package com.curso.v2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.Random;

class Employee {
    private int id;
    private String name;
    private String department;
    private double salary;
    private LocalDate joinDate;
    private int age;

    public Employee(int id, String name, String department, double salary, LocalDate joinDate, int age) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.joinDate = joinDate;
        this.age = age;
    }

    // Getters
    public int getId() { return id; }
    public String getName() { return name; }
    public String getDepartment() { return department; }
    public double getSalary() { return salary; }
    public LocalDate getJoinDate() { return joinDate; }
    public int getAge() { return age; }

    @Override
    public String toString() {
        return String.format("Employee{id=%d, name='%s', department='%s', salary=%.2f, joinDate=%s, age=%d}",
                id, name, department, salary, joinDate, age);
    }
}

public class EmployeeStreamProcessing {
    public static void main(String[] args) {
        List<Employee> employees = generateEmployees(100);

        // 1. Filtrar empleados por departamento y salario, ordenar por edad
        System.out.println("1. Empleados de IT con salario > 50000, ordenados por edad:");
        employees.stream()
                .filter(e -> e.getDepartment().equals("IT"))
                .filter(e -> e.getSalary() > 50000)
                .sorted(Comparator.comparing(Employee::getAge))
                .forEach(System.out::println);

        // 2. Agrupar por departamento y calcular salario promedio
        System.out.println("\n2. Salario promedio por departamento:");
        Map<String, Double> avgSalaryByDept = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.averagingDouble(Employee::getSalary)
                ));
        avgSalaryByDept.forEach((dept, avg) -> 
                System.out.printf("%s: %.2f%n", dept, avg));

        // 3. Encontrar los 5 empleados más jóvenes contratados este año
        System.out.println("\n3. Los 5 empleados más jóvenes contratados este año:");
        employees.stream()
                .filter(e -> e.getJoinDate().getYear() == LocalDate.now().getYear())
                .sorted(Comparator.comparing(Employee::getAge))
                .limit(5)
                .forEach(System.out::println);

        // 4. Estadísticas de salarios por departamento
        System.out.println("\n4. Estadísticas de salarios por departamento:");
        Map<String, DoubleSummaryStatistics> salaryStatsByDept = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.summarizingDouble(Employee::getSalary)
                ));
        salaryStatsByDept.forEach((dept, stats) -> 
                System.out.printf("%s: min=%.2f, max=%.2f, avg=%.2f%n", 
                        dept, stats.getMin(), stats.getMax(), stats.getAverage()));

        // 5. Contar empleados por rango de edad
        System.out.println("\n5. Cantidad de empleados por rango de edad:");
        Map<String, Long> employeesByAgeRange = employees.stream()
                .collect(Collectors.groupingBy(
                        e -> {
                            if (e.getAge() < 25) return "18-24";
                            else if (e.getAge() < 35) return "25-34";
                            else if (e.getAge() < 45) return "35-44";
                            else return "45+";
                        },
                        Collectors.counting()
                ));
        employeesByAgeRange.forEach((range, count) -> 
                System.out.printf("%s: %d empleados%n", range, count));
    }

    private static List<Employee> generateEmployees(int count) {
        List<Employee> employees = new ArrayList<>();
        Random random = new Random();
        String[] departments = {"IT", "HR", "Finance", "Marketing", "Sales"};
        String[] names = {"Ana", "Juan", "María", "Carlos", "Patricia", "Miguel", "Laura", "José", "Carmen", "David"};
        
        for (int i = 0; i < count; i++) {
            String name = names[random.nextInt(names.length)];
            String department = departments[random.nextInt(departments.length)];
            double salary = 30000 + random.nextDouble() * 70000;
            LocalDate joinDate = LocalDate.now().minusDays(random.nextInt(365 * 2));
            int age = 22 + random.nextInt(40);
            
            employees.add(new Employee(i + 1, name, department, salary, joinDate, age));
        }
        
        return employees;
    }
}
