package _compound_exercises.service.Impl;

import _compound_exercises.models.NhanVien;
import _compound_exercises.models.NhanVienCongNhat;
import _compound_exercises.models.NhanVienQuanLy;
import _compound_exercises.models.NhanVienSanXuat;

import java.util.*;

public class MapThongTinNhanVien {

    static Scanner sc = new Scanner(System.in);
    static Map<Integer, NhanVien> nhanVienMap = new LinkedHashMap<>();

    static {
        nhanVienMap.put(1, new NhanVienQuanLy("Ha", "23/05/1996", "QuangBinh", 6000000, 3));
        nhanVienMap.put(5, new NhanVienSanXuat("Khanh", "06/04/1999", "Hung Yen", 24));
        nhanVienMap.put(2, new NhanVienCongNhat("Hoa", "09/09/1992", "Thanh Hoa", 16));
        nhanVienMap.put(4, new NhanVienSanXuat("Tien", "17/08/1999", "Ha Tinh", 19));
        nhanVienMap.put(3, new NhanVienSanXuat("Hung", "12/04/1998", "Ninh Binh", 32));

    }

    public static void hienThiMapNhanVien() {
        Set<Integer> key = nhanVienMap.keySet();
        for (Integer temp : key) {
            System.out.println("id: " + temp + ", " + nhanVienMap.get(temp));
        }
    }

    //CHECK id nếu đã có thì báo đã tồn tại nếu không thì báo là chưa
    public static void kiemTraMaNhanVien() {
        System.out.println("Nhập vào id cần kiểm tra:");
        int keySearch = sc.nextInt();
        if (nhanVienMap.containsKey(keySearch)) {
            System.out.println("Key đã tồn tại");
        } else {
            System.out.println("Key chưa tồn tại trong danh sách");
        }
    }

}
