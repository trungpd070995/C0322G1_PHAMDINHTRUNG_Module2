package _compound_exercises.service.Impl;

import _compound_exercises.models.NhanVien;
import _compound_exercises.models.NhanVienCongNhat;
import _compound_exercises.models.NhanVienSanXuat;
import _compound_exercises.models.NhanVienQuanLy;

import java.util.Collections;

public class ArrayNhanVien {

    static NhanVien[] nhanViens = new NhanVien[1000];

    static {
        nhanViens[0] = new NhanVienCongNhat("Hoang", "01/02/1995", "Ha Tinh", 10);
        nhanViens[1] = new NhanVienSanXuat("Minh", "02/03/1996", "Quang Binh", 30);
        nhanViens[2] = new NhanVienQuanLy("Hieu", "01/01/1990", "Hue", 8000000, 3);
        nhanViens[3] = new NhanVienCongNhat("Trung", "07/09/1995", "Quang Binh", 30);
        nhanViens[4] = new NhanVienSanXuat("Thanh", "05/07/1999", "Da Nang", 27);
    }

    public static void hienThiThongTin() {
        for (NhanVien temp : nhanViens) {
            if (temp != null) {
                System.out.println(temp);
            }
        }
    }
}

/**
 * iv: từ khóa instanceof để kiểm tra xem đối tượng có phải là thể hiện class nào đó hay không
 * v :khi có 1001 nhân viên lưu trữ trong mang 1000 phần tử thì sẽ bị lỗi tràn mảng
 * vi:phương thức toString dc ghi đè lại từ class Object là thể hiện của đa hình ở runtime
 * vii: các Constructor có cùng tên nhưng khác tham số truyền vào là thể hiện của đa hình ở compile
 */

