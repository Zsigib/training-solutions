package classstructureintegrate;

import java.util.Scanner;

public class Bank {




    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Mi a bankszámlaszám?");
        String accountNumber = scanner.nextLine();
        System.out.println("Ki a tulajdonos?");
        String owner = scanner.nextLine();
        System.out.println("Mekkora az induló összeg?");
        int  balance = scanner.nextInt();
        BankAccount bankAccount = new BankAccount(accountNumber, owner, balance);
        System.out.println(bankAccount);

        System.out.println("Mi a bankszámlaszám?");
        String accountNumber2 = scanner.nextLine();
        System.out.println("Ki a tulajdonos?");
        String owner2 = scanner.nextLine();
        System.out.println("Mekkora az induló összeg?");
        int  balance2 = scanner.nextInt();
        BankAccount bankAccount2 = new BankAccount(accountNumber2, owner2, balance2);

    }
}
