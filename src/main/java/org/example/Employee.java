package org.example;

public class Employee extends Company {
    private final String name;
    private final String surname;
    private final int salary;

    public Employee(String name, String surname, int salary) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Salary for " + this.name + " " + this.surname + " is " + this.salary;
    }
}
