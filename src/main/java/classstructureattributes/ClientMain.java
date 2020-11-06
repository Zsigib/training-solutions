package classstructureattributes;

import java.util.Scanner;

public class ClientMain {

    public static void main(String[] args) {
        Client client = new Client();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kérlek add meg a neved:");
        client.name = scanner.nextLine();
        System.out.println("Kérlek add meg a születési éved:");
        client.year = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Kérlek add meg a címed:");
        client.address = scanner.nextLine();
        System.out.println("Adataid: ");
        System.out.println("Név: " + client.name);
        System.out.println("Születési idő: " + client.year);
        System.out.println("Cím: " + client.address);
    }
}
