package Program;

import util.Calculator;

import java.util.Scanner;

public class Radius {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter radius: ");
        double radius = scanner.nextDouble();

        double c = Calculator.circuference(radius);

        double v = Calculator.volume(radius);

        System.out.printf("Circuference: %.2f%n" , c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("PI Value: %.2f%n", Calculator.PI);




        scanner.close();
    }
}
