package q4;

import java.util.Date;

public class ATMTransactions {
    private int transactionId;
    private Date date;
    private String type;
    private double amount;
    private double postBalance;

    public ATMTransactions(int transactionId, String type, double amount) {
        this.transactionId = transactionId;
        this.type = type;
        this.amount = amount;
    }

    public void modifies(Account account) {
        if (type.equals("withdraw")) {
            if (amount <= account.getBalance()) {
                postBalance = account.getBalance() - amount;
            } else
                System.out.println("Balance is not enough");
        }

        if (type.equals("deposit"))
            postBalance = account.getBalance() + amount;
    }

    public int getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getPostBalance() {
        return postBalance;
    }
}
