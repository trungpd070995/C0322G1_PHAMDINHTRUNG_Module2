package _compound_exercises.service.Impl;

import _compound_exercises.models.NhanVien;
import _compound_exercises.models.NhanVienCongNhat;
import _compound_exercises.models.NhanVienSanXuat;
import _compound_exercises.models.NhanVienQuanLy;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListNhanVien {
    static ArrayList<NhanVien> nhanVienArrayList = new ArrayList<>();

    static {
        nhanVienArrayList.add(new NhanVienSanXuat("Hai", "12/04/1997", "Quang Nam", 50));
        nhanVienArrayList.add(new NhanVienCongNhat("Thanh", "08/01/1993", "Quang Ngai", 25));
        nhanVienArrayList.add(new NhanVienQuanLy("Tung", "05/05/1985", "TP.Ho Chi Minh", 6000000, 7));
    }

    public static void hienThiArrayList() {
        for (NhanVien temp : nhanVienArrayList) {
            if (temp != null) {
                System.out.println(temp);
            }
        }
    }
}
/**
 * iii: ArrayList không cần khởi tạo trước 1000 phần tử vì độ dài của mảng có thể thay đổi để phù hợp với số lượng phần tử thay đổi được lưu trong mảng
 * iv: Nếu công ty có 1001 nhân viên thì mảng sẽ tự động thay đổi độ dài bằng 1001 nên sẽ không có vấn đề
 * v:ưu điểm arraylist so với array
 * + kích thước có thể thay đổi
 * + cung cấp nhiều phương thức để thao tác
 * nhược điểm:
 * +chỉ có thể lưu trữ đối tượng
 * + các thao tác sẽ chậm hơn
 */
