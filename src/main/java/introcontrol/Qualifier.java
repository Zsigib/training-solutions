package introcontrol;

import java.util.Scanner;

public class Qualifier {

    public static void main(String[] args) {

        System.out.println("Kérek egy számot!");

        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        scanner.nextLine();

        if (number <= 100) {
            System.out.println("száz, vagy kisebb");
        }
        else {
            System.out.println("nagyobb, mint száz");
        }
    }
}
