package Program;
/**
 * nesse programa irei calcular dois trianngulos sem orienntação a objetos
 */


import java.util.Scanner;

public class applicaitons {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double xA, xB, xC, yA, yB, yC;

        System.out.println("Enter the measures of triangle X: ");
        xA = scanner.nextDouble();
        xB = scanner.nextDouble();
        xC = scanner.nextDouble();
        System.out.println("Enter the measures of triangle Y: ");
        yA = scanner.nextDouble();
        yB = scanner.nextDouble();
        yC = scanner.nextDouble();

        double p = (xA + xB + xC) / 2.0;
        double areX = Math.sqrt(p *(p - xA) * (p - xB) * (p - xC));

        p = (yA + yB + yC) / 2.0;
        double areY = Math.sqrt(p *(p - yA) * (p - yB) * (p - yC));

        System.out.printf("Triangle X area: %.4f%n", areX);
        System.out.printf("Triangle Y area: %.4f%n", areY);





        scanner.close();
    }
}
