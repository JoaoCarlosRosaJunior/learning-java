package Exercicio1.application;

import java.util.Locale;
import java.util.Scanner;

import Exercicio1.entities.Account;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        Account account;

        int accountNumber;
        String accountHolder;

        System.out.print("Enter account number: ");
        accountNumber = sc.nextInt();
        System.out.print("Enter account holder: ");
        sc.nextLine();
        accountHolder = sc.nextLine();
        System.out.print("Is there na initial deposit (y/n)?");
        char response = sc.next().charAt(0);
        if (response == 'y') {
            System.out.print("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            account = new Account(accountNumber, accountHolder, initialDeposit);
        } else {
            account = new Account(accountNumber, accountHolder);
        }

        System.out.println();
        System.out.println("Account Data: ");
        System.out.println(account);
        System.out.println("Enter a deposit value: ");
        double depositValue = sc.nextDouble();
        account.deposit(depositValue);

        System.out.println();
        System.out.println("Updated Account Data: ");
        System.out.println(account);
        System.out.println("Enter a withdraw value: ");
        double withdrawValue = sc.nextDouble();
        account.withdraw(withdrawValue);

        System.out.println();
        System.out.println("Updated Account Data: ");
        System.out.println(account);

        sc.close();
    }
}
