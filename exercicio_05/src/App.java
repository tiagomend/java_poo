import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Account account;

        System.out.print("Número da conta: ");
        int number = sc.nextInt();
        sc.nextLine();
        System.out.print("Titular da conta: ");
        String holder = sc.nextLine();
        double balance;

        System.out.print("Existe um depósito inicial [S/n]? ");
        char response = sc.next().charAt(0);

        if (response == 'S'){
            System.out.print("Depósito inicial: ");
            balance = sc.nextDouble();

            account = new Account(number, holder, balance);
        } else {
            account = new Account(number, holder);
        }

        System.out.println();
        System.out.println("Dados da Conta: ");
        System.out.println(account);

        System.out.println();
        System.out.print("Faça um depósito: ");
        double amount = sc.nextDouble();
        account.deposit(amount);
        System.out.println("Dados atualizados: ");
        System.out.println(account);

        System.out.println();
        System.out.print("Faça um saque: ");
        amount = sc.nextDouble();
        account.withdraw(amount);
        System.out.println("Dados atualizados: ");
        System.out.println(account);

        sc.close();
    }
}
