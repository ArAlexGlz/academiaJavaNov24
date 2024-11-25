package com.curso.v0;

import java.util.*;
import java.util.stream.Stream;

class Student {
    private String name;
    private int age;
    private double grade;

    public Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public double getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + ", grade=" + grade + '}';
    }
}

public class StreamCollectExample {
    public static void main(String[] args) {
        // Generate 100 random students
        List<Student> students = new ArrayList<>();
        Random random = new Random();
        
        for (int i = 0; i < 1000; i++) {
            students.add(new Student(
                "Student" + i,
                18 + random.nextInt(5),
                60 + random.nextDouble() * 40
            ));
        }
        
        students.forEach(est -> System.out.println(est));

        // Using collect to calculate average grade by accumulating sum and count
        class GradeAccumulator {
            double sum = 0;
            int count = 0;
        }

        GradeAccumulator result = students.stream().collect(
            // supplier: creates new accumulator
            () -> new GradeAccumulator(),
            
            // accumulator: adds each student's grade to accumulator
            (acc, student) -> {
                acc.sum += student.getGrade();
                acc.count++;
            },
            
            // combiner: combines two accumulators
            (acc1, acc2) -> {
                acc1.sum += acc2.sum;
                acc1.count += acc2.count;
            }
        );

        double averageGrade = result.sum / result.count;
        System.out.println("Average grade: " + averageGrade);
    }
}
