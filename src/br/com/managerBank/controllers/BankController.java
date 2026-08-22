package br.com.managerBank.controllers;

public class BankController {
    private final static Scanner scanner = new Scanner(System.in);
    private final static BankService bankService

    public BankController(BankService bankService) {
        this.bankService = bankService:
    }

    public static void deposit() {
        System.out.println("What the value to you want deposite?");
        double value = scanner.nextDouble();
        System.out.println("The deposite in value " + value + " with sucess");
    }

    public static void withdraw() {

    }

    public static void transferer() {
        
    }

    public static void showBalance() {

    }
}