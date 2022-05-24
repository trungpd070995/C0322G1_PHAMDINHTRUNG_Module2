package _compound_exercises.controller;

import _compound_exercises.models.NhanVien;
import _compound_exercises.models.NhanVienQuanLy;
import _compound_exercises.models.NhanVienSanXuat;
import _compound_exercises.service.Impl.ArrayListNhanVien;
import _compound_exercises.service.Impl.ArrayNhanVien;
import _compound_exercises.service.Impl.LinkedListNhanVien;
import _compound_exercises.service.Impl.MapThongTinNhanVien;

import java.util.Scanner;

public class Controller {
    static Scanner sc = new Scanner(System.in);

    public static void menuChinh() {
        LinkedListNhanVien linkedListNhanVien = new LinkedListNhanVien();
        MapThongTinNhanVien mapThongTinNhanVien = new MapThongTinNhanVien();

        do {
            System.out.println("MENU CHÍNH");
            System.out.println("1.Hiển thị danh sách");
            System.out.println("2.Kiểm tra mã nhân viên");
            System.out.println("3.Sắp xếp theo tên");
            System.out.println("4.Sắp xếp theo lương");
            System.out.println("5.Sắp xếp cả hai (tên & lương)");
            System.out.println("6.Thoát");
            int choose = Integer.parseInt(sc.nextLine());
            switch (choose) {
                case 1:
                    System.out.println("----Array----");
                    ArrayNhanVien.hienThiThongTin();
                    System.out.println("----ArrayList----");
                    ArrayListNhanVien.hienThiArrayList();
                    System.out.println("----LinkedList----");
                    LinkedListNhanVien.hienThiLinkedList();
                    System.out.println("----MapNhanVien----");
                    MapThongTinNhanVien.hienThiMapNhanVien();
                    break;
                case 2:
                    MapThongTinNhanVien.kiemTraMaNhanVien();
                    break;
                case 3:
                    linkedListNhanVien.sapXepTheoTen();
                    LinkedListNhanVien.hienThiLinkedList();
                    break;
                case 4:
                    linkedListNhanVien.sapXepTheoLuong();
                    LinkedListNhanVien.hienThiLinkedList();
                    break;
                case 5:
                    linkedListNhanVien.sapXepLuongVaTen();
                    LinkedListNhanVien.hienThiLinkedList();
                    break;
                case 6:
                    System.exit(6);
                    break;
                default:
                    System.err.println("Chọn từ 1 đến 6");
            }
        } while (true);
    }
}
