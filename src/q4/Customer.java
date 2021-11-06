package q4;

import java.util.ArrayList;

public class Customer {
    private String name;
    private String address;
    private String dob;
    private long cardNumber;
    private int pin;
    private ArrayList<Account> accounts = new ArrayList<>();

    public boolean verifyPassword(int pin) {
        return this.pin == pin;
    }

    public void addAccount(Account account) {
        if (accounts.size() <= 2 && !accounts.contains(account)) {
            accounts.add(account);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public long getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(long cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    public Account getAccountByNumber(long accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber() == accountNumber)
                return account;
        }
        return null;
    }
}
