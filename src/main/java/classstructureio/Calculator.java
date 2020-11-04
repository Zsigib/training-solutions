package classstructureio;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kérem az első egész számot!");
        int firstNumber = scanner.nextInt();
        System.out.println("Kérem a második egész számot!");
        int secondNumber = scanner.nextInt();
        int sum = firstNumber + secondNumber;
        System.out.println("A Számok összege:" + sum);

    }
}
