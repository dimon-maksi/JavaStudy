package org.example;

public class AccountNotFoundException extends Exception{
    AccountNotFoundException(String massage)
    {
        super(massage);
    }
}