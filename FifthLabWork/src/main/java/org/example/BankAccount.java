package org.example;
import java.math.BigDecimal;

public class BankAccount {
    private static int accountNumber = 0;
    private int ID;
    private String accountName;
    private BigDecimal balance = new BigDecimal("0.0");

    public static int getAccountNumber() {
        return accountNumber;
    }

    public int getID() {
        return ID;
    }

    public String getAccountName() {
        return accountName;
    }

    public BigDecimal getBalance() {
        return balance;
    }
}
