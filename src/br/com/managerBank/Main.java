package br.com.managerBank;

import br.com.managerBank.controllers.BankController;

import java.util.Scanner;

public class Main {

    private final static Scanner scanner = new Scanner(System.in);
    private final BankController controller = new BankController();

    public static void main(String[] agra) {

        int options;
            
        do {
            System.out.println("********** Welcome, MANAGER BANK **********");
            System.out.println("What are you going to do today?");
            System.out.println("1- Deposit");
            System.out.println("2- Withdraw");
            System.out.println("3- Transfer");
            System.out.println("4- Balance");
            System.out.println("0- Sair");

            switch(options) {
                    case 1 -> controller.deposit();
                    case 2 -> controller.withdraw();
                    case 3 -> controller.transferer();
                    case 4 -> controller.showBalance();
                    case 0 -> System.exit(0);
                    default -> System.out.println("Invalid options");
                }
            } while(options != 0);
        }
    }