import java.util.Scanner;

public class Main {
    private final static Scanner scanner= new Scanner(System.in);

    public static void main(String[] args) {
        var options = -1;

        do {
            System.out.println("O que você Deseja fazer hoje?");
            System.out.println("1- Depositar");
            System.out.println("2- Sacar");
            System.out.println("3- Transferência ");
            System.out.println("4- Sair");

            options = scanner.nextInt();

            switch(options) {
                case 1 -> deposite()
                case 2 -> sacar();
                case 3 -> transferer();
                case 4 -> System.exit(4);
                default -> System.out.println("Invalid Option");
            }
        } while(options != 0);
    }

    public static void deposite() {
        System.out.println("Qual valor que você deseja depositar?");
        double deposit = scanner.nextDouble();
        System.out.println("O deposito no valor de " + deposit + " foi realizado com sucesso");
    }

    public static void sacar() {

    }

    public static void transferer() {

    }
}