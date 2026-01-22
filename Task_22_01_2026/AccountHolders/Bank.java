package Task_22_01_2026.AccountHolders;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private String bankName;

    public Bank(String bankName) {
        this.bankName = bankName;
    }

    public void openAccount(Customer customer, double initialBalance) {
        customer.setBalance(initialBalance);
        System.out.println("Account opened for " + bankName);
    }
}
