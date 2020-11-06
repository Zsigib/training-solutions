package classstructureio;

import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kérem a felhasználó nevet:");
        String name = scanner.nextLine();
        System.out.println("Kérem az email címet:");
        String email = scanner.nextLine();

         System.out.println("A regisztált adatok: " + name +" " + email);


    }
}
