package Program;

import entities.Rectangle;

import java.util.Scanner;

public class ProgramRectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();
        System.out.println("Enter rectangle widht and height");
        rectangle.width = scanner.nextDouble();
        rectangle.height = scanner.nextDouble();

        System.out.println(rectangle);


        scanner.close();
    }
}
