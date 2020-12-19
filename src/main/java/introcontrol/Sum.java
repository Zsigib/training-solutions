package introcontrol;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {

        int sum = 0;

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5;  i++) {
            System.out.println("Kérem az "+ (i + 1) + "számot!");
            int number = scanner.nextInt();
            scanner.nextLine();
            sum += number;
        }

        System.out.println("Az összeg: " + sum);

    }
}
