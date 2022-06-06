package _compound_exercise2.controller;

import _compound_exercise2.service.impl.ImplService;

import java.util.Scanner;

public class Controller {
    static Scanner scanner = new Scanner(System.in);
    static ImplService service = new ImplService();

    public static void displayMainMenu() {
        do {
            System.out.println("CÔNG TY QUẢN LÝ ABC");
            System.out.println("1.Hiển thị danh sách");
            System.out.println("2.Thêm mới");
            System.out.println("3.Xóa");
            System.out.println("4.Tìm kiếm");
            System.out.println("5.Thoát");
            String choose = scanner.nextLine();
            switch (choose) {
                case "1":
                    service.display();
                    break;
                case "2":
                    displayAddNhanVien();
                    break;
                case "3":
                    service.remove();
                    break;
                case "4":
                    service.find();
                    break;
                case "5":
                    return;
                default:
                    System.out.println("lựa chọn không hợp lệ");
            }
        } while (true);
    }

    public static void displayAddNhanVien() {
        do {
            System.out.println("1.Thêm mới nhân viên quản lý!");
            System.out.println("2.Thêm mới nhân viên sản xuất!");
            System.out.println("3.Thoát");
            String choose = scanner.nextLine();
            switch (choose) {
                case "1":
                    service.addNhanVienQuanLy();
                    break;
                case "2":
                    service.addNhanVienSanXuat();
                    break;
                case "3":
                    return;
                default:
                    System.err.println("Vui lòng chọn lại ! ");
            }
        } while (true);
    }
}

