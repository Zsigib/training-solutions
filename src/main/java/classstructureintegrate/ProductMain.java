package classstructureintegrate;

import java.util.Scanner;

public class ProductMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println(" Kérem a termék nevét!");
        String name = scanner.nextLine();

        System.out.println(" Kérem a termék árát!");
        int price = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Kérem az ár változást!");
        int change = scanner.nextInt();
        scanner.nextLine();

        Product product = new Product(name, price);

        System.out.println("Eredeti ár:");
        System.out.println(product.getName() + " " + product.getPrice());
        System.out.println("Növelt ár:");
        System.out.println(product.getName() + " " + product.increasePrice(change));
        System.out.println("Csökkentett ár:");
        System.out.println(product.getName() + " " + product.decreasePrice(change));


    }
}
