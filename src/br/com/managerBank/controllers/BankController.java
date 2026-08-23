package br.com.managerBank.controllers;

import br.com.managerBank.service.BankService;
 
import java.util.Scanner;

public class BankController {

    private final static Scanner scanner = new Scanner(System.in);
    private final static BankService = service;
                            
    public class BankController {

        public BankController(BankService bankService) {
            this.bankService = service;
        }

        public static void deposit() {
            System.out.println("What the value to you want deposite?");
            double value = scanner.nextDouble();
            System.out.println("The deposite in value " + value + "carried out with sucess");
        }

        public static void withdraw() {
            System.out.println("What the value for withdraw?");
            double withdraw = scanner.nextDouble();
            System.out.println("The Widthdraw of value of " + withdraw + " with sucess.");
        }

        public static void transferer() {
            System.out.println("Branch number:");
            int agency = scanner.nextInt();

            System.out.println("Account number:");
            int account = scanner.nextInt();

            System.out.println("People name:");
            String name = scanner.nextLine();

            System.out.println("What's is the transferer value?");
            double valueTransferer = scanner.nextDouble();

            System.out.println("The value of transferer " + valueTransferer + " for agency" + agency + " and account " + account
            + " People name: " + name + " carried out with sucess.");
        }

        public static void showBalance() {
            System.out.println("The balance of value is of ");
        }                                                                                                                                                                                             
    }
}