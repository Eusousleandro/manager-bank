package br.com.managerBank;

import br.com.managerBank.models.BankAccount;

import java.util.HashMap;
import java.util.Map;

public class BankRepository {
    private Map<Integer, BankAccount> account;

    public BankRepository(BankAccount account) {
        this.account = new HashMap<>();
    }

    public void find(Balance balance) {
        System.out.println(account);
    }

    public void save(Balance balance) {
        account.put(account);
    }
}