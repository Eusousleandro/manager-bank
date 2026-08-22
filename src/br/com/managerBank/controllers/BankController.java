package br.com.managerBank.controllers;

import java.util.Scanner;

public class BankController {

   private final static Scanner scanner = new Scanner(System.in);

   public static void deposit() {
       System.out.println("Qual valor você deseja depositar hoje?");
       double value = scanner.nextDouble();
       System.out.println("O deposito no valor de " + value + " foi realizado com sucesso.")
   }
}