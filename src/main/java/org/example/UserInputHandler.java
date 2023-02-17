package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInputHandler extends Employee {
    final static int OPTION_1 = 1;
    final static int OPTION_2 = 2;
    final static int OPTION_3 = 3;
    final static int OPTION_4 = 4;
    final static int INITIAL_EMPLOYEES_INPUT_NUMBER = 5;
    static int selectedOptionNumber;

    private UserInputHandler(String name, String surname, int salary) {
        super(name, surname, salary);
    }

    private static void printIncorrectDataInputInformation() {

        System.out.println("Incorrect input. Please provide required data.");
    }


    private static String getEmployeeNameFromUser() {

        System.out.println("Please provide employee name:");
        Scanner scanner = new Scanner(System.in);
        String employeeName = "";
        while (employeeName.equals("")) {
            employeeName = scanner.nextLine();
            if (employeeName.equals("")) {
                printIncorrectDataInputInformation();
            }
        }
        return employeeName;
    }

    private static String getEmployeeSurnameFromUser() {

        System.out.println("Please provide employee surname:");
        Scanner scanner = new Scanner(System.in);
        String employeeSurname = "";
        while (employeeSurname.equals("")) {
            employeeSurname = scanner.nextLine();
            if (employeeSurname.equals("")) {
                printIncorrectDataInputInformation();
            }
        }
        return employeeSurname;
    }

    private static int getEmployeeSalaryFromUser() {

        System.out.println("Please provide employee salary amount:");
        Scanner scanner = new Scanner(System.in);
        int employeeSalary = 0;
        while (employeeSalary <= 0) {
            employeeSalary = scanner.nextInt();
            if (employeeSalary <= 0) {
                printIncorrectDataInputInformation();
            }
        }
        return employeeSalary;
    }

    public static Employee getEmployeeDataFromUser() {

        return new Employee(UserInputHandler.getEmployeeNameFromUser(), UserInputHandler.getEmployeeSurnameFromUser(),
                UserInputHandler.getEmployeeSalaryFromUser());
    }

    public static void printProgramMenu() {
        System.out.println("""
                Please choose from the following options:
                1 – Print sum of all employees salary
                2 – Display all employees data
                3 – Add new employee
                4 – End program
                """);
    }

    public static void chooseMenuOption() {

        try {
            Scanner scanner = new Scanner(System.in);
            selectedOptionNumber = scanner.nextInt();

            switch (selectedOptionNumber) {
                case OPTION_1 -> PayrollProgram.printAllEmployeesSalary();
                case OPTION_2 -> PayrollProgram.printAllEmployeesData();
                case OPTION_3 -> PayrollProgram.addEmployee();
                case OPTION_4 -> PayrollProgram.endProgram();
                default -> printIncorrectDataInputInformation();
            }
        } catch (InputMismatchException | NumberFormatException e) {
            e.printStackTrace();
            printIncorrectDataInputInformation();
        }
    }
}

