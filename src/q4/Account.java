package q4;

import java.util.ArrayList;

public class Account {
    private long accountNumber;
    private double balance;
    private ArrayList<ATMTransactions> atmTransactions = new ArrayList<>();
    private int transactionId = 1;

    public void deposit(double amount) {
        createTransaction("deposit", amount);
    }

    public void withdraw(double amount) {
        createTransaction("withdraw", amount);
    }

    public void createTransaction(String type, double amount) {
        ATMTransactions atmTransaction = new ATMTransactions(transactionId, type, amount);
        atmTransaction.modifies(this);
        balance = atmTransaction.getPostBalance();
        atmTransactions.add(atmTransaction);
        transactionId++;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public ArrayList<ATMTransactions> getAtmTransactions() {
        return atmTransactions;
    }
}
