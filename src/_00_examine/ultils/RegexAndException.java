package _00_examine.ultils;

import _00_examine.model.SavingBankAccount;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class RegexAndException {
    private static Scanner scanner = new Scanner(System.in);
    private static List<SavingBankAccount> savingBankAccountList;
    private static SavingBankAccount savingBankAccount;
    private static List<String[]> stringList;
    private static final String SAVING_PATH = "src\\_00_examine\\data\\bank_saving_account.csv";
    private static final String PAYOUT_PATH = "src\\_00_examine\\data\\bank_payout_account.csv";
    private static final String REGEX_STR = "^[A-Z]([a-z\\s]{1,8})+$";
    private static final String REGEX_CODE = "^\\d+$";
    private static final String REGEX_NAME = "^[A-Z][a-z]*(\\ [A-Z][a-z]*)*\\s*$";
    private static final String REGEX_DATE = "(([0-2][0-9])|([3][0-1]))[\\/](([0][1-9])|([1][0,2]))[\\/]\\d{4}";

    public static String inputCode() {
        String name = scanner.nextLine();
        boolean check = true;
        do {
            if (name.matches(REGEX_CODE)) {
                check = false;
            } else {
                System.err.println("Please input again, the right format must be numbers");
                name = scanner.nextLine();
            }
        } while (check);
        return name;
    }

    public static String inputName() {
        String name = scanner.nextLine();
        boolean check = true;
        do {
            if (name.matches(REGEX_NAME)) {
                check = false;
            } else {
                System.err.println("Please input again, the first letter must be upper case");
                name = scanner.nextLine();
            }
        } while (check);
        return name;
    }

    public static int getSavingId() {
        int id;
        stringList = ReadAndWrite.readCsvFile(SAVING_PATH);
        for (String[] str: stringList) {

        }
        if (stringList.isEmpty()){
            id = 1;
        } else {
            id = stringList.size() + 1;
        }
        return id;
    }

    public static int getPayoutId() {
        int id;
        stringList = ReadAndWrite.readCsvFile(PAYOUT_PATH);
        for (String[] str: stringList) {

        }
        if (stringList.isEmpty()){
            id = 1;
        } else {
            id = stringList.size() + 1;
        }
        return id;
    }

    public static List<SavingBankAccount> readFile(String path) {
        List<SavingBankAccount> list = new ArrayList<>();
        stringList = ReadAndWrite.readCsvFile(path);
        for (String[] strArr : stringList) {
            savingBankAccount = new SavingBankAccount(strArr);
            list.add(savingBankAccount);
        }
        return list;
    }

    public static String inputDate() {
        String creationDate;

        while (true) {
            try {
                creationDate = scanner.nextLine();
                if (Pattern.matches(REGEX_DATE, creationDate)) {
                    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                    LocalDate start = LocalDate.parse(creationDate, dateTimeFormatter);
                    LocalDate now = LocalDate.now();

                    if (start.isAfter(now)) {
                        return creationDate;
                    } else {
                        System.err.println("The start date must be after now, please input again");
                    }
                } else {
                    throw new Exception("Please input the right format of date dd/MM/yyyy");
                }
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }
    }

    public static int inputAmount() {
        int amount;

        while (true){
            try {
                amount = Integer.parseInt(scanner.nextLine());
                if (amount <= 0) {
                    throw new NumberFormatException();
                }
                return amount;
            } catch (NumberFormatException e) {
                System.err.println("Please input a positive number");
            }
        }
    }

    public static double inputInterestRate() {
        double interestRate;

        while (true){
            try {
                interestRate = Double.parseDouble(scanner.nextLine());
                if (interestRate <= 0) {
                    throw new NumberFormatException();
                }
                return interestRate;
            } catch (NumberFormatException e) {
                System.err.println("Please input a positive number");
            }
        }
    }
}
