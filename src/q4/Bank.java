package q4;

import java.util.ArrayList;

public class Bank {
    private int code;
    private String address;
    private ArrayList<ATM> atms = new ArrayList<>();
    private ArrayList<Account> accounts = new ArrayList<>();

    public void manages(Account account) {
        if (accounts.contains(account))
            System.out.println("This ATM account previously added");
        else {
            accounts.add(account);
            System.out.println("account was added");
        }
    }

    public void maintains(ATM atm) {
        if (atms.contains(atm))
            System.out.println("This ATM was previously added");
        else {
            atms.add(atm);
            System.out.println("ATM was added");
        }
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
