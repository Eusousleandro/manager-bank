package br.com.managerBank.repositors;

import br.com.managerBank.models.BankAccount;

import java.util.HashMap;
import java.util.Map;

public class BankRepository {
    private Map<Integer, BankAccount> account;

    public BankRepository() {
        this.account = new HashMap<>();
    }

    public void consult() {
        System.out.println(account);
    }

    public void searchById(BankAccount bankAccount) {
        Integer depositById = null;
        if(account.isEmpty()) {
            depositById = account.get(bankAccount.name);
        }

        return depositById
    }

    public void deposite(BankAccount bankAccount) {
        account.put(bankAccount);
    }

    public void removeDeposit(BankAccount bankAccount) {
        if(account.isEmpty()) {
            account.remove(bankAccount);
        }
    }
}