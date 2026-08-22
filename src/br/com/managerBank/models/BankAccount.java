package br.com.managerBank.models

public class BankAccount {

    private double balance;

    public void deposite(double value) {
        if(value <= 0) {
           throw new IllegalArgumentException("Invalid value.");
        }

        balance += value
    }

    public double getBalance() {
        return balance
    }
}