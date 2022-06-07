package _00_examine.service;


import _00_examine.model.SavingBankAccount;
import _00_examine.ultils.ReadAndWrite;
import _00_examine.ultils.RegexAndException;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SavingBankAccountImpl implements Service {
    private Scanner scanner = new Scanner(System.in);
    private List<SavingBankAccount> savingBankAccountList;
    private SavingBankAccount savingBankAccount;
    private List<String[]> stringList;
    private final String SAVING_PATH = "src\\_00_examine\\data\\bank_saving_account.csv";


    public List<SavingBankAccount> readFile(String path) {
        List<SavingBankAccount> list = new ArrayList<>();
        stringList = ReadAndWrite.readCsvFile(path);
        for (String[] strArr : stringList) {
            savingBankAccount = new SavingBankAccount(strArr);
            list.add(savingBankAccount);
        }
        return list;
    }

    @Override
    public void display() {
        savingBankAccountList = readFile(SAVING_PATH);
        for (SavingBankAccount savingBankAccount:savingBankAccountList) {
            System.out.println(savingBankAccount.getInfo());
        }
    }

    @Override
    public void addNew() {
        savingBankAccountList = readFile(SAVING_PATH);
        System.out.println("--INPUT INFORMATION OF SAVING BANK ACCOUNT---");

        int id = RegexAndException.getSavingId();;

        System.out.println("Input account code: ");
        String code = RegexAndException.inputCode();

        System.out.println("Input account name: ");
        String name = RegexAndException.inputName();

        System.out.println("Input creation date: ");
        String creationDate = RegexAndException.inputDate();

        System.out.println("Input deposit amount of money to save: ");
        int amount = RegexAndException.inputAmount();

        System.out.println("Input deposit date: ");
        String depositDate = RegexAndException.inputDate();

        System.out.println("Input interest rate: ");
        double interestRate = RegexAndException.inputInterestRate();

        System.out.println("Input term of saving in month: ");
        int term = RegexAndException.inputAmount();

        savingBankAccount = new SavingBankAccount(id, code, name, creationDate, amount, depositDate, interestRate, term);
        savingBankAccountList.add(savingBankAccount);

        ReadAndWrite.writeCsvFile(savingBankAccountList, SAVING_PATH);
    }

    @Override
    public void edit() {

    }

    @Override
    public void remove() {
        savingBankAccountList = readFile(SAVING_PATH);

        for (SavingBankAccount savingBankAccount:savingBankAccountList) {
            System.out.println(savingBankAccount.getInfo());
        }
        System.out.println("Input id of account you want to remove: ");
        int id;
        int count = 0;
        try{
            id = Integer.parseInt(scanner.nextLine());
            for (SavingBankAccount item:savingBankAccountList) {
                count = 0;
                if (item.getId() == id){
                    savingBankAccountList.remove(item);
                    ReadAndWrite.writeCsvFile(savingBankAccountList, SAVING_PATH);
                    System.out.println("Remove successfully");
                    count++;
                    break;
                }
            }
            if (count == 0){
                System.out.println("Not Found");
            }
        } catch (NumberFormatException e) {
            System.err.println("Please input a number again: ");
        }
    }

    @Override
    public void search() {
        savingBankAccountList = readFile(SAVING_PATH);
        System.out.println("Input id of account you want to search: ");
        int id;
        int count = 0;

        try{
            id = Integer.parseInt(scanner.nextLine());
            for (SavingBankAccount item:savingBankAccountList) {
                count = 0;
                if (item.getId() == id){
                    System.out.println(item.getInfo());
                    count++;
                    break;
                }
            }
            if (count == 0){
                System.out.println("Not Found");
            }
        } catch (NumberFormatException e) {
            System.err.println("Please input a number again: ");
        }
    }
}
