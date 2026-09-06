package services;

import repositories.BankRepository;


public class BankService {
    private final BankRepository repository = new BankRepository();

    public void deposit(BankRepository repository) {
        repository.save();
    }
}