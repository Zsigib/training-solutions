package classstructureintegrate;

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
/*
    public  deposit(){
        return balance + change;
    }
    public  withdraw(){
        return balance - change;

    }
    public  transfer(){
        return balance ;
*/
}

