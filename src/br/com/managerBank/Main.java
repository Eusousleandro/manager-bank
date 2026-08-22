package br.cok.managerBank;

import br.com.managerBank.controllers.BankController;

import java.util.Scanner;

public class Main {
    private final static Scanner scanner= new Scanner(System.in);

    public static void main(String[] args) {
        BankController controller  = new BankController();

        var options;

        do {
            System.out.println("********** Welcome, MANAGER BANK **********")
            System.out.println("O que você Deseja fazer hoje?");
            System.out.println("1- Deposite");
            System.out.println("2- Withdraw");
            System.out.println("3- Transferer");
            System.out.println("4- Exit");
            
            System.out.println("What is a operation the today?")
            options = scanner.nextInt();

            switch(options) {
                case 1 -> controller.deposit();
                case 2 -> sacar();
                case 3 -> transferer();
                case 4 -> System.exit(4);
                default -> System.out.println("Invalid Option");
            }
        } while(options != 4);
    }
}