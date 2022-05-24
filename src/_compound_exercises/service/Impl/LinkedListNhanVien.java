package _compound_exercises.service.Impl;

import _compound_exercises.models.NhanVien;
import _compound_exercises.models.NhanVienCongNhat;
import _compound_exercises.models.NhanVienSanXuat;
import _compound_exercises.models.NhanVienQuanLy;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListNhanVien {
    static LinkedList<NhanVien> nhanVienLinkedList = new LinkedList<>();

    static {
        nhanVienLinkedList.add(new NhanVienSanXuat("Vu", " 02/02/1996", "Binh Dinh", 32));
        nhanVienLinkedList.add(new NhanVienCongNhat("Hoa", "07/04/1993", "Quang Tri", 29));
        nhanVienLinkedList.add(new NhanVienQuanLy("Kien", "09/09/1992", "Ha Noi", 9000000, 4));
    }

    public static void hienThiLinkedList() {
        for (NhanVien temp : nhanVienLinkedList) {
            if (temp != null) {
                System.out.println(temp);
            }
        }
    }

    public void sapXepTheoTen() {
        Collections.sort(nhanVienLinkedList, new SapXepTen());
    }

    public void sapXepTheoLuong() {
        Collections.sort(nhanVienLinkedList, new SapXepLuong());
    }

    public void sapXepLuongVaTen() {
        Collections.sort(nhanVienLinkedList);
    }
}
/**
 * ii:Không nên dùng fori để duyệt linkedlist vì các phần tử được lưu liên kết với nhau bằng các tham chiếu nên nếu dùng fori
 * thì sẽ có độ phức tạp của thuật toán cao hơn so với foreach
 * iii: nếu công ty liên tục thay đổi nhân sự thì nên dùng linkedlist vì ưu điểm của LinkedList so với arraylist là xóa và thêm
 * iv:nhược điểm của linkedlist so với arraylist
 * +các thao tác truy xuất sẽ chậm hơn
 * -ưu điểm:
 * +các thao tác chèn xóa sẽ nhanh hơn
 */
