package classstructureintegrate;

import java.util.Scanner;

public class BankAccount {


    private String accountNumber;
    private String owner;
    private int balance;


    public BankAccount(String accountNumber, String owner, int balance) {

    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }




    public void deposit(int change) {
        this.balance = balance + change;
    }

    public void withdraw(int change2) {
        balance = balance - change2;
    }

    public void transfer(int change2) {

    }
}

