package _00_examine.controller;

import _00_examine.service.PayoutBankAccountImpl;
import _00_examine.service.SavingBankAccountImpl;

import java.util.Scanner;

public class BankAccountSearch {
    private static SavingBankAccountImpl savingBankAccount = new SavingBankAccountImpl();
    private static PayoutBankAccountImpl payoutBankAccount = new PayoutBankAccountImpl();

    public static void displayMainMenu() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("---MENU---");
            System.out.println("1.\tSearch saving account\n" +
                    "2.\tSearch payout account\n" +
                    "3.\tReturn to main menu\n" +
                    "4.\tExit\n");
            try {
                System.out.println("Input your choice: ");
                choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        savingBankAccount.search();
                        break;
                    case 2:
                        payoutBankAccount.search();
                        break;
                    case 3:
                        BankAccountManagementController.displayMainMenu();
                        break;
                    case 4:
                        System.exit(0);
                    default:
                        System.err.println("Your choice does not match our options");
                }
            } catch (NumberFormatException e) {
                System.err.println("Please input a number which matches our options");
            }
        }
    }
}
