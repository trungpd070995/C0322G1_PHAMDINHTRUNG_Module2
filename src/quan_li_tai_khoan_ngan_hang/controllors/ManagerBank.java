package quan_li_tai_khoan_ngan_hang.controllors;

import quan_li_tai_khoan_ngan_hang.service.impl.BankAccount1;


import java.util.Scanner;

public class ManagerBank {
    private static Scanner scanner = new Scanner(System.in);
     private static BankAccount1 bankAccount1 = new BankAccount1();

    public static void main(String[] args) {
             displayBank();
    }
    public static void displayBank() {
        while (true) {
            System.out.println("---- CHƯƠNG TRÌNH QUẢN LÍ TÀI KHOẢN NGÂN HÀNG----");
            System.out.println("Chọn chức năng theo số để tiếp tục :");
            System.out.println("1.Thêm mới");
            System.out.println("2.Xoá");
            System.out.println("3.Xem danh sách tài khoản ngân hàng ");
            System.out.println("4.Tìm kiếm");
            System.out.println("5. Thoát");
            System.out.println("Chọn chức năng :");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    System.out.println("Bạn muốn thêm vào :");
                    System.out.println("1.AddNewSavingsBank\n"
                    +"2.AddNewPayBank\n"+"3.Thoát");
                    choice = scanner.nextLine();
                    switch (choice){
                        case "1":
                            bankAccount1.addNewSavingBank();
                            break;
                        case "2":
                            bankAccount1.addNewPayBank();
                            break;
                        case "3":
                            displayBank();
                        default:
                            System.out.println("Nhập định dạng sai");
                    }
                    break;
                case "2":
                    bankAccount1.removeBank();
                    break;
                case "3":
                    bankAccount1.displayBank();
                    break;
                case "4":
                    bankAccount1.findByName();
                    break;
                case "5":
                    System.exit(5);
                    break;
                default:
                    System.out.println("Nhập định dạng sai");
            }
        }


}
}
