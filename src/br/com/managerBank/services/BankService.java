package br.com.managerBank.services;

import br.com.managerBank.models.BankAccount;

public class BankService {
    public static void deposite(BankAccount account, double value) {
        account.deposite(value);
    }
}