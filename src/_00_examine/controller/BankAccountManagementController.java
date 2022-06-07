package _00_examine.controller;

import _00_examine.service.PayoutBankAccountImpl;
import _00_examine.service.SavingBankAccountImpl;

import java.util.Scanner;

public class BankAccountManagementController {
    public static SavingBankAccountImpl savingBankAccount = new SavingBankAccountImpl();
    public static PayoutBankAccountImpl payoutBankAccount = new PayoutBankAccountImpl();

    public static void main(String[] args) {
        displayMainMenu();
    }

    public static void displayMainMenu() {
        Scanner scanner = new Scanner(System.in);
        int choice;
        while (true) {
            System.out.println("---BANK ACCOUNT MANAGEMENT PROGRAM---");
            System.out.println("1.\tAdd New \n" +
                    "2.\tRemove\n" +
                    "3.\tDisplay bank account list\n" +
                    "4.\tSearch\n" +
                    "5.\tExit\n");
            try {
                System.out.println("Input your choice: ");
                choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        BankAccountCreation.displayMainMenu();
                        break;
                    case 2:
                        BankAccountRemove.displayMainMenu();
                        break;
                    case 3:
                        System.out.println("-------SAVING ACCOUNT--------- ");
                        savingBankAccount.display();
                        System.out.println("-----------PAYOUT ACCOUN------ ");
                        payoutBankAccount.display();
                        break;
                    case 4:
                        BankAccountSearch.displayMainMenu();
                        break;
                    case 5:
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
