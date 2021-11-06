package q4;

import java.util.ArrayList;

public class ATM {
    private String location;
    private String managedBy;
    private Customer customer;

    public Customer identifies(int pin) {
        boolean identified = customer.verifyPassword(pin);
        if (identified)
            return customer;
        return null;
    }

    public ArrayList<ATMTransactions> transactions(long accountNumber, int pin) {
        Customer tempCustomer = identifies(pin);
        Account account = tempCustomer.getAccountByNumber(accountNumber);
        return account.getAtmTransactions();
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getManagedBy() {
        return managedBy;
    }

    public void setManagedBy(String managedBy) {
        this.managedBy = managedBy;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
