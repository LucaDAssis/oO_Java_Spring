package Program;
/**
 * nesse programa irei calcular dois trianngulos sem orienntação a objetos
 */


import entities.Triangle;

import java.util.Scanner;

public class applicaitons {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Triangle x, y;
        x = new Triangle();
        y = new Triangle();

        System.out.println("Enter the measures of triangle X: ");
        x.a = scanner.nextDouble();
        x.b = scanner.nextDouble();
        x.c = scanner.nextDouble();
        System.out.println("Enter the measures of triangle Y: ");
        y.a = scanner.nextDouble();
        y.b = scanner.nextDouble();
        y.c = scanner.nextDouble();

        double areX = x.area();
        double areY = y.area();

        System.out.printf("Triangle X area: %.4f%n", areX);
        System.out.printf("Triangle Y area: %.4f%n", areY);





        scanner.close();
    }
}
