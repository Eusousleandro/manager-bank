package br.com.managerBank;

import br.com.managerBank.models.BankAccount;

import java.util.HashMap;
import java.util.Map;

public class BankRepository {
    private Map<Integer, BankAccount> account;

    public BankRepository(BankAccount account) {
        this.account = new HashMap<>();
    }

    public void find(BankAccount account) {
        System.out.println(account);
    }

    public void save(BankAccount account) {
        account.put(account);
    }
}