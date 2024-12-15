package com.dic13.v0;

class Person{
    String name="no name";
    public Person(String nm){
        name=nm;
    }
}
class Employee extends Person{
    String empID="0000";
    public Employee(String id){
        super(id);
        empID=id;
    }
}
class Main {
    public static void main(String[] args) {
        Employee e=new Employee("4321");
        System.out.println(e.empID);
    }
}