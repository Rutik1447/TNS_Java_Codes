package com.day3loopz;
import java.util.Scanner;
public class Atmaccess {
    public static void main(String[] args) {
        int balance = 50000;
        int pin = 1234;
        String lastTransaction = "No transactions made";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your PIN: ");
        int enteredPin = sc.nextInt();
        if (enteredPin != pin) {
            System.out.println("Acces.s denied. Incorrect PIN.");
            return;
        }
        while (true) {
            System.out.println("\n1. Withdraw Cash");
            System.out.println("2. Deposit Cash");
            System.out.println("3. Check Balance");
            System.out.println("4. View Last Transaction");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to withdraw: ");
                    int withdraw = sc.nextInt();
                    if (withdraw > 0 && withdraw <= balance) {
                        balance -= withdraw;
                        lastTransaction = "You withdrew: Rs." + withdraw;
                        System.out.println("Withdrawal successful!");
                    } else {
                        System.out.println("Insufficient funds or invalid amount.");
                    }
                    break;
                case 2:
                    System.out.print("Enter amount to deposit: ");
                    int deposit = sc.nextInt();
                    if (deposit > 0) {
                        balance += deposit;
                        lastTransaction = "You deposited: Rs." + deposit;
                        System.out.println("Deposit successful!");
                    } else {
                        System.out.println("Invalid deposit amount.");
                    }
                    break;
                case 3:
                    System.out.println("Your current balance is: Rs." + balance);
                    break;
                case 4:
                    System.out.println("Last transaction: " + lastTransaction);
                    break;
                case 5:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}