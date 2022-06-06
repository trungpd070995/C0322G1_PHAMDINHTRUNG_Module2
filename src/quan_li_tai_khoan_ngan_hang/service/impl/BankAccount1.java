package quan_li_tai_khoan_ngan_hang.service.impl;

import quan_li_tai_khoan_ngan_hang.controllors.ManagerBank;
import quan_li_tai_khoan_ngan_hang.models.bank.AccountBank;
import quan_li_tai_khoan_ngan_hang.models.bank.BankPayment1;
import quan_li_tai_khoan_ngan_hang.models.bank.SavingsBank1;
import quan_li_tai_khoan_ngan_hang.service.inter.BankPayment;
import quan_li_tai_khoan_ngan_hang.service.inter.SavingsBank;
import quan_li_tai_khoan_ngan_hang.utils.NotFoundBankAccountException;
import quan_li_tai_khoan_ngan_hang.utils.ReadAndWriteFile;
import quan_li_tai_khoan_ngan_hang.utils.RegexData;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BankAccount1 implements BankPayment, SavingsBank {
    private static List<AccountBank> accountBanks = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    private static final String FILE_BANK = "src\\quan_li_tai_khoan_ngan_hang\\data\\bank_account.csv";
    private static final String FILE_MA_KHACH_HANG = "^[0][0-9]{7,}$";
    private static final String FILE_NAME = "^([a-zA-Z]{2,}\\s[a-zA-Z]{1,}'?-?[a-zA-Z]{2,}\\s?([a-zA-Z]{1,})?)$";
    private static final String FILE_DAY = "^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/|-|\\.)(?:0?[13-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$";

    private int checkId() {
        if (accountBanks.size() == 0) {
            return 1;
        } else {
            return accountBanks.get(accountBanks.size() - 1).getId() + 1;
        }
    }

    @Override
    public void addNewPayBank() {
        int id = checkId();
        System.out.println("Nhập mã khách hàng :");
        String accountCode = RegexData.regexData(scanner.nextLine(), FILE_MA_KHACH_HANG, "Tài khoản khách hàng bắt đầu con số 0 và không được nhập chữ và số");
        System.out.println("Nhập tên khách hàng :");
        String name = RegexData.regexData(scanner.nextLine(), FILE_NAME, "Bạn đã định dạng sai , chữ cái bắt đầu viết hoa và không có số và kí tự");
        System.out.println("Nhập ngày tạo tài khoản :");
        String day = RegexData.regexData(scanner.nextLine(), FILE_DAY, "Bạn đã định dạng sai , không được nhập chữ");
        System.out.println("Nhập tài khoản tiết kiệm ngân hàng :");
        int cardNumber = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tài khoản thanh toán :");
        int accountMoney = Integer.parseInt(scanner.nextLine());
        AccountBank accountBank = new BankPayment1(id, accountCode, name, day, cardNumber, accountMoney);
        accountBanks.add(accountBank);
        ReadAndWriteFile.writeFileList(FILE_BANK, accountBanks);


    }

    @Override
    public void addNewSavingBank() {
        int id = checkId();
        System.out.println("Nhập mã khách hàng :");
        String accountCode = RegexData.regexData(scanner.nextLine(), FILE_MA_KHACH_HANG, "Tài khoản khách hàng bắt đầu con số 0 và không được nhập chữ và số");
        System.out.println("Nhập tên khách hàng :");
        String name = RegexData.regexData(scanner.nextLine(), FILE_NAME, "Bạn đã định dạng sai , chữ cái bắt đầu viết hoa và không có số và kí tự");
        System.out.println("Nhập ngày tạo tài khoản :");
        String day = RegexData.regexData(scanner.nextLine(), FILE_DAY, "Bạn đã định dạng sai , không được nhập chữ");
        System.out.println("Nhập số tiền gửi tiết kiệm :");
        int saveMoney = Integer.parseInt(scanner.nextLine());
        System.out.println("Ngày gửi tiết kiệm :");
        String sentDayMoney = RegexData.regexData(scanner.nextLine(), FILE_DAY, "Bạn đã định dạng sai, không được nhập chữ");
        System.out.println("Nhập lãi suất :");
        double interestRate = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập kì hạn :");
        int tenor = Integer.parseInt(scanner.nextLine());
        AccountBank accountBank = new SavingsBank1(id, accountCode, name, day, saveMoney, sentDayMoney, interestRate, tenor);
        accountBanks.add(accountBank);
        ReadAndWriteFile.writeFileList(FILE_BANK, accountBanks);


    }


    @Override
    public void removeBank() {
        displayBank();
        try {
            System.out.println("Nhập mã tài khoản  mà bạn muốn xoá trong danh sách :");
            String accountCode = scanner.nextLine();
            boolean check = false;
            for (AccountBank item : accountBanks) {
                if (item.getAccountCode().equals(accountCode)) {
                    System.out.println("Bạn có muốn xoá (Y/N)");
                    String confirm = scanner.nextLine();
                    if ("Y".equals(confirm.toUpperCase())) {
                        accountBanks.remove(item);
                        ReadAndWriteFile.writeFileList(FILE_BANK, accountBanks);
                        System.out.println("Xoá thành công");
                    } else if ("N".equals(confirm.toUpperCase())) {
                        ManagerBank.displayBank();
                    }
                    check = true;
                    break;
                }
            }
            if (!check) {
                throw new NotFoundBankAccountException();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
    }

    @Override
    public void displayBank() {
        List<AccountBank> accountBanks = new ArrayList<>();
        List<String[]> list = ReadAndWriteFile.readFile(FILE_BANK);
        AccountBank accountBank;
//        accountBanks.clear();
        try {
            for (String[] item: list) {
                 if(item.length == 8){
                     accountBank = new SavingsBank1(Integer.parseInt(item[0]), item[1], item[2], item[3]
                                , Integer.parseInt(item[4]), item[5], Double.parseDouble(item[6]), Integer.parseInt(item[7]));
                     accountBanks.add(accountBank);
                 }else if(item.length == 6){
                     accountBank = new BankPayment1(Integer.parseInt(item[0]), item[1], item[2], item[3],
                                Integer.parseInt(item[4]), Integer.parseInt(item[5]));
                        accountBanks.add(accountBank);
                 }
            }

        }catch (Exception e){
            System.out.println("Bạn đã định dạng sai");
        }
        for (AccountBank item : accountBanks) {
            System.out.println(item);
        }

    }

    @Override
    public void findByName() {
        try {
            System.out.println("Nhập tên khách hàng mà người dùng muốn tìm :");
            String name = scanner.nextLine();
            boolean check = false;
            for (AccountBank item : accountBanks) {
                if (item.getName().contains(name)) {
                    System.out.println(item);
                    check = true;
                }
            }
            if (!check) {
                throw new NotFoundBankAccountException();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }


}
