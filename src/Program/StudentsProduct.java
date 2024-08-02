package Program;

import entities.Student;

import java.util.Scanner;

public class StudentsProduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student student = new Student();

        System.out.println("Nome do Aluno: ");
        student.name = scanner.nextLine();








        scanner.close();
    }
}
