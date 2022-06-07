package _compound_exercise3.controller;

import _compound_exercise3.service.impl.ServiceImpl;

import java.util.Scanner;

public class Controller {
    static Scanner scanner = new Scanner(System.in);
    static ServiceImpl service = new ServiceImpl();

    public static void displayMainMenu() {
        do {
            System.out.println("BÀI TẬP NHỎ 2");
            System.out.println("1.Hiển thị danh sách");
            System.out.println("2.Thêm mới");
            System.out.println("3.Xóa");
            System.out.println("4.Sắp xếp");
            System.out.println("5.Chỉnh sửa");
            System.out.println("6.Thoát");
            String choose = scanner.nextLine();
            switch (choose) {
                case "1":
                    service.display();
                    break;
                case "2":
                    displayAddPerson();
                    break;
                case "3":
                    service.remove();
                    break;
                case "4":
                    service.sort();
                    break;
                case "5":
                    service.edit();
                case "6":
                    return;
                default:
                    System.out.println("lựa chọn không hợp lệ");
            }
        } while (true);
    }

    public static void displayAddPerson() {
        do {
            System.out.println("1.Thêm mới Teacher!");
            System.out.println("2.Thêm mới Student!");
            System.out.println("3.Thoát");
            String choose = scanner.nextLine();
            switch (choose) {
                case "1":
                    service.addNewTeacher();
                    break;
                case "2":
                    service.addNewStudent();
                    break;
                case "3":
                    return;
                default:
                    System.err.println("Vui lòng chọn lại ! ");
            }
        } while (true);
    }
}
