package org.example;

public class PayrollProgram extends Employee {

    private PayrollProgram(String name, String surname, int salary) {
        super(name, surname, salary);
    }

    public static void printAllEmployeesSalary() {
        int total = 0;
        for (Employee employee : employeesList) {
            int employeeSalary = employee.getSalary();
            total += employeeSalary;
        }
        System.out.println("The sum of all employees salary is: " + total);
    }

    public static void printAllEmployeesData() {
        for (Employee employee : employeesList) {
            String employeeData = employee.toString();
            System.out.println(employeeData);
        }
    }

    public static void addEmployee() {
        employeesList.add(UserInputHandler.getEmployeeDataFromUser());

    }

    public static void endProgram() {
        System.out.println("End of the program.");
    }
}
