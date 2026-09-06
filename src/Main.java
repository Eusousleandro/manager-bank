
import controlleries.BankController;
import services.BankService;
import repositories.BankRepository;

import java.util.Scanner;

public class Main {

    private final Scanner scanner = new Scanner(System.in);

    public static void main(String[] agrs) {

        BankRepository repository = new BankRepository();
        BankService service = new BankService(repository);
        BankController bank = new BankController(service);

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
                    case 1 -> setDeposit();
                    case 2 -> setWithdraw();
                    case 3 -> setTransfer();
                    case 4 -> setShowBalance();
                    case 0 -> System.exit(0);
                    default -> System.out.println("Invalid options");
                }
            } while(options != 0);
        }

        public static void setDeposit(){
           bank.deposit();
        }

        public static void setWithdraw() {
           bank.withdraw();
        }

        public static void setTransfer() {
           bank.transfer();
        }

        public static void setShowBalance() {
            bank.showBalance();
        }
    }