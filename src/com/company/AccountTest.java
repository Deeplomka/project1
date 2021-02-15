// author: Abulkhair Zhamiyev
// Testing Account class
package com.company;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class AccountTest {
    public static void main(String[] args){
        // like cin in c++

        Scanner scanner = new Scanner(System.in);
//        Account account3 = new Account();

        // Account account1 = new Account("Abish", 50.00);
        Account account1 = new Account();

        account1.setName("Abish");
        account1.deposit(50.00);
//        Account account2 = new Account("Aldiyar");
        System.out.println(account1.toString());
        // System.out.print(account1.getBalance());
        // System.out.println();
//        System.out.printf("%s's balance: $%.2f%n", account1.getName(), account1.getBalance()); // %s - outputs the first string in parameter list
//        System.out.printf("%s's balance: $%.2f%n", account2.getName(), account2.getBalance()); // %.3f  - outputs the first float number in par. list
//        account1.setName(scanner.nextLine());
//        account2.setName(scanner.nextLine());
//        account1.deposit(-100);
//        account2.deposit(46.51);
//        System.out.printf("%s's balance: $%.2f%n", account1.getName(), account1.getBalance());
//        System.out.printf("%s's balance: $%.2f%n", account2.getName(), account2.getBalance());
        // JOptionPane.showMessageDialog(null, "Hello world!");
    }
} // end class AccountTest
