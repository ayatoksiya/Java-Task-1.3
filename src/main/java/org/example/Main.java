package org.example;

public class Main {
    public static void main(String[] args) {

        int numberOfInput = 1;
        while (numberOfInput <= UserInputHandler.INITIAL_EMPLOYEES_INPUT_NUMBER) {
            Company.employeesList.add(UserInputHandler.getEmployeeDataFromUser());
            numberOfInput++;
        }

        while (UserInputHandler.selectedOptionNumber != UserInputHandler.OPTION_4) {
            UserInputHandler.printProgramMenu();
            UserInputHandler.chooseMenuOption();
        }
    }
}
