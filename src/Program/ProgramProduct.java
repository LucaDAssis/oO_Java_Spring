package Program;

import entities.Product;

import java.util.Scanner;

public class ProgramProduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Product product = new Product();

        System.out.println("Enter Product Data:");
        System.out.println("Name: ");
        product.name = scanner.next();
        System.out.println("Price: ");
        product.price = scanner.nextDouble();
        System.out.println("Quantity in Stock: ");
        product.quantity = scanner.nextInt();

        //System.out.println("Product data: " + product.name + " ," +
        //    "R$: " + product.price + " ," + product.quantity + " Units" +
        //        " Total: $" + product.TotalValueInStock());

        System.out.println(product);



        scanner.close();
    }
}
