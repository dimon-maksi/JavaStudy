package org.example;
import java.math.BigDecimal;

public class BankAccount {
    private static int accountNumber = 0;
    private int ID;
    private String accountName;
    private BigDecimal balance = new BigDecimal("0.0");

    public BankAccount(String accountName,BigDecimal initialDeposit) {
        this.accountName = accountName;
        this.balance=initialDeposit;
        ID=++accountNumber;
    }
    public void deposit(BigDecimal amount) {
        balance = balance.add(amount);
    }

    public void withdraw(BigDecimal amount){

        balance = balance.subtract(amount);
    }
    public String getAccountSummary() {
        String str =accountName+" "+ID+" "+balance ;
        return str;
    }
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
