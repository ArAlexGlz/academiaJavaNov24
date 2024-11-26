package com.curso.v2;

import java.time.LocalDate;
import java.util.*;


class EmployeeAnalyzer {
    private List<Employee> employees;

    public EmployeeAnalyzer(List<Employee> employees) {
        this.employees = employees;
    }

    // 1. Filtrar empleados por departamento y salario, ordenar por edad
    public List<Employee> getITEmployeesWithHighSalary() {
        List<Employee> filteredEmployees = new ArrayList<>();
        
        // Filtrar empleados de IT con salario > 50000
        for (Employee emp : employees) {
            if (emp.getDepartment().equals("IT") && emp.getSalary() > 50000) {
                filteredEmployees.add(emp);
            }
        }
        
        // Ordenar por edad
        Collections.sort(filteredEmployees, new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                return Integer.compare(e1.getAge(), e2.getAge());
            }
        });
        
        return filteredEmployees;
    }

    // 2. Calcular salario promedio por departamento
    public Map<String, Double> calculateAverageSalaryByDepartment() {
        Map<String, List<Double>> salariesByDept = new HashMap<>();
        Map<String, Double> avgSalaryByDept = new HashMap<>();

        // Agrupar salarios por departamento
        for (Employee emp : employees) {
            salariesByDept.computeIfAbsent(emp.getDepartment(), k -> new ArrayList<>())
                         .add(emp.getSalary());
        }

        // Calcular promedios
        for (Map.Entry<String, List<Double>> entry : salariesByDept.entrySet()) {
            double sum = 0;
            List<Double> salaries = entry.getValue();
            for (Double salary : salaries) {
                sum += salary;
            }
            avgSalaryByDept.put(entry.getKey(), sum / salaries.size());
        }

        return avgSalaryByDept;
    }

    // 3. Encontrar los 5 empleados más jóvenes contratados este año
    public List<Employee> getFiveYoungestNewEmployees() {
        List<Employee> thisYearEmployees = new ArrayList<>();
        int currentYear = LocalDate.now().getYear();

        // Filtrar empleados de este año
        for (Employee emp : employees) {
            if (emp.getJoinDate().getYear() == currentYear) {
                thisYearEmployees.add(emp);
            }
        }

        // Ordenar por edad
        Collections.sort(thisYearEmployees, new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                return Integer.compare(e1.getAge(), e2.getAge());
            }
        });

        // Obtener los primeros 5
        return thisYearEmployees.subList(0, Math.min(5, thisYearEmployees.size()));
    }

    // 4. Calcular estadísticas de salarios por departamento
    public Map<String, DepartmentStats> calculateDepartmentSalaryStats() {
        Map<String, DepartmentStats> statsMap = new HashMap<>();

        for (Employee emp : employees) {
            String dept = emp.getDepartment();
            double salary = emp.getSalary();
            
            if (!statsMap.containsKey(dept)) {
                statsMap.put(dept, new DepartmentStats());
            }
            
            DepartmentStats stats = statsMap.get(dept);
            stats.addSalary(salary);
        }

        return statsMap;
    }

    // 5. Contar empleados por rango de edad
    public Map<String, Integer> countEmployeesByAgeRange() {
        Map<String, Integer> countByRange = new HashMap<>();
        countByRange.put("18-24", 0);
        countByRange.put("25-34", 0);
        countByRange.put("35-44", 0);
        countByRange.put("45+", 0);

        for (Employee emp : employees) {
            String range;
            if (emp.getAge() < 25) range = "18-24";
            else if (emp.getAge() < 35) range = "25-34";
            else if (emp.getAge() < 45) range = "35-44";
            else range = "45+";

            countByRange.put(range, countByRange.get(range) + 1);
        }

        return countByRange;
    }
}

class DepartmentStats {
    private double minSalary = Double.MAX_VALUE;
    private double maxSalary = Double.MIN_VALUE;
    private double totalSalary = 0;
    private int count = 0;

    public void addSalary(double salary) {
        minSalary = Math.min(minSalary, salary);
        maxSalary = Math.max(maxSalary, salary);
        totalSalary += salary;
        count++;
    }

    public double getMinSalary() { return minSalary; }
    public double getMaxSalary() { return maxSalary; }
    public double getAverageSalary() { return totalSalary / count; }
}

public class EmployeeOOPProcessing {
    public static void main(String[] args) {
        List<Employee> employees = generateEmployees(100);
        EmployeeAnalyzer analyzer = new EmployeeAnalyzer(employees);

        // 1. Filtrar empleados de IT con alto salario
        System.out.println("1. Empleados de IT con salario > 50000, ordenados por edad:");
        List<Employee> itEmployees = analyzer.getITEmployeesWithHighSalary();
        for (Employee emp : itEmployees) {
            System.out.println(emp);
        }

        // 2. Mostrar salario promedio por departamento
        System.out.println("\n2. Salario promedio por departamento:");
        Map<String, Double> avgSalaries = analyzer.calculateAverageSalaryByDepartment();
        for (Map.Entry<String, Double> entry : avgSalaries.entrySet()) {
            System.out.printf("%s: %.2f%n", entry.getKey(), entry.getValue());
        }

        // 3. Mostrar los 5 empleados más jóvenes contratados este año
        System.out.println("\n3. Los 5 empleados más jóvenes contratados este año:");
        List<Employee> youngEmployees = analyzer.getFiveYoungestNewEmployees();
        for (Employee emp : youngEmployees) {
            System.out.println(emp);
        }

        // 4. Mostrar estadísticas de salarios por departamento
        System.out.println("\n4. Estadísticas de salarios por departamento:");
        Map<String, DepartmentStats> deptStats = analyzer.calculateDepartmentSalaryStats();
        for (Map.Entry<String, DepartmentStats> entry : deptStats.entrySet()) {
            DepartmentStats stats = entry.getValue();
            System.out.printf("%s: min=%.2f, max=%.2f, avg=%.2f%n",
                    entry.getKey(), stats.getMinSalary(), stats.getMaxSalary(), stats.getAverageSalary());
        }

        // 5. Mostrar cantidad de empleados por rango de edad
        System.out.println("\n5. Cantidad de empleados por rango de edad:");
        Map<String, Integer> ageRangeCounts = analyzer.countEmployeesByAgeRange();
        for (Map.Entry<String, Integer> entry : ageRangeCounts.entrySet()) {
            System.out.printf("%s: %d empleados%n", entry.getKey(), entry.getValue());
        }
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
