package br.cok.managerBank;

import br.com.managerBank.controllers.BankController;

import java.util.Scanner;

public class Main {
    private final static Scanner scanner= new Scanner(System.in);

    public static void main(String[] args) {
<<<<<<< HEAD
        BankController controller = new BankController();
=======
        BankController controller  = new BankController();

        var options;
>>>>>>> 1c9b05691ba86a7b1e5ed1a12765655ba0e76e42

        var options;
        do {
            System.out.println("********** Welcome, MANAGER BANK **********")
            System.out.println("O que você Deseja fazer hoje?");
<<<<<<< HEAD
            System.out.println("1- Depositar");
            System.out.println("2- Sacar");
            System.out.println("3- Transferência ");
            System.out.println("4- Sair");

            System.out.println("Escolha a opção desejada:");
=======
            System.out.println("1- Deposite");
            System.out.println("2- Withdraw");
            System.out.println("3- Transferer");
            System.out.println("4- Exit");
            
            System.out.println("What is a operation the today?")
>>>>>>> 1c9b05691ba86a7b1e5ed1a12765655ba0e76e42
            options = scanner.nextInt();

            switch(options) {
                case 1 -> controller.deposit();
<<<<<<< HEAD
                case 2 -> sacar();
                case 3 -> transferer();
                case 4 -> System.exit(4);
                default -> System.out.println("Invalid Option");
            }
        } while(options !=4);

        scanner.close();
=======
                case 2 -> controller.withdraw();
                case 3 -> controller.transferer();
                case 4 -> controller.showBalance()
                case 0 -> System.exit(0);
                default -> System.out.println("Invalid Option");
            }
        } while(options != 0);
>>>>>>> 1c9b05691ba86a7b1e5ed1a12765655ba0e76e42
    }
}