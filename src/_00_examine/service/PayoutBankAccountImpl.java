package _00_examine.service;

import _00_examine.model.PayoutBankAccount;
import _00_examine.ultils.ReadAndWrite;
import _00_examine.ultils.RegexAndException;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PayoutBankAccountImpl implements Service{
    private Scanner scanner = new Scanner(System.in);
    private List<PayoutBankAccount> payoutBankAccountList;
    private PayoutBankAccount payoutBankAccount;
    private List<String[]> stringList;
    private final String PAYOUT_PATH = "src\\_00_examine\\data\\bank_payout_account.csv";


    public List<PayoutBankAccount> readFile(String path) {
        List<PayoutBankAccount> list = new ArrayList<>();
        stringList = ReadAndWrite.readCsvFile(path);
        for (String[] strArr : stringList) {
            payoutBankAccount = new PayoutBankAccount(strArr);
            list.add(payoutBankAccount);
        }
        return list;
    }
    @Override
    public void display() {
        payoutBankAccountList = readFile(PAYOUT_PATH);
        for (PayoutBankAccount payoutBankAccount:payoutBankAccountList) {
            System.out.println(payoutBankAccount.getInfo());
        }
    }

    @Override
    public void addNew() {
        payoutBankAccountList = readFile(PAYOUT_PATH);
        System.out.println("--INPUT INFORMATION OF PAYOUT BANK ACCOUNT---");

        int id = RegexAndException.getPayoutId();

        System.out.println("Input account code: ");
        String code = RegexAndException.inputCode();

        System.out.println("Input account name: ");
        String name = RegexAndException.inputName();

        System.out.println("Input creation date: ");
        String creationDate = RegexAndException.inputDate();

        System.out.println("Input card number: ");
        String cardNumber = RegexAndException.inputCode();

        System.out.println("Input money in account: ");
        int amount = RegexAndException.inputAmount();

        payoutBankAccount = new PayoutBankAccount(id, code, name, creationDate, cardNumber, amount);
        payoutBankAccountList.add(payoutBankAccount);

        ReadAndWrite.writeCsvFile(payoutBankAccountList, PAYOUT_PATH);
    }

    @Override
    public void edit() {

    }

    @Override
    public void remove() {
        payoutBankAccountList = readFile(PAYOUT_PATH);

        for (PayoutBankAccount payoutBankAccount:payoutBankAccountList) {
            System.out.println(payoutBankAccount.getInfo());
        }
        System.out.println("Input id of account you want to remove: ");
        int id;
        int count = 0;
        try{
            id = Integer.parseInt(scanner.nextLine());
            for (PayoutBankAccount item:payoutBankAccountList) {
                count = 0;
                if (item.getId() == id){
                    payoutBankAccountList.remove(item);
                    ReadAndWrite.writeCsvFile(payoutBankAccountList, PAYOUT_PATH);
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
        payoutBankAccountList = readFile(PAYOUT_PATH);

        for (PayoutBankAccount payoutBankAccount:payoutBankAccountList) {
            System.out.println(payoutBankAccount.getInfo());
        }
        System.out.println("Input id of account you want to search: ");
        int id;
        int count = 0;
        try{
            id = Integer.parseInt(scanner.nextLine());
            for (PayoutBankAccount item:payoutBankAccountList) {
                count = 0;
                if (item.getId() == id){
                   item.getInfo();
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
