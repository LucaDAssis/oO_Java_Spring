package Program;

import entities.Employee;

import java.util.Scanner;

public class ProgramEmployee {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Employee employee = new Employee();

        System.out.println("Name: ");
        employee.name = scanner.nextLine();
        System.out.println("Gross Salary: ");
        employee.GrossSalary = scanner.nextDouble();
        System.out.println("Tax: ");
        employee.tax = scanner.nextDouble();

        System.out.println("Employee: " + employee);

        System.out.print("Which percentage to increase salary? ");
        double percentage = scanner.nextDouble();
        employee.IncreaseSalary(percentage);
        System.out.println("Update: " + employee);






        scanner.close();
    }
}
