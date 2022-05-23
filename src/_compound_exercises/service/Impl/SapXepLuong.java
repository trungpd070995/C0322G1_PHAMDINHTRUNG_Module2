package _compound_exercises.service.Impl;

import _compound_exercises.models.NhanVien;

import java.util.Comparator;

public class SapXepLuong implements Comparator<NhanVien> {
    @Override
    public int compare(NhanVien o1, NhanVien o2) {
        if (o1.tinhLuong() > o2.tinhLuong()) {
            return 1;
        } else {
            return -1;
        }
    }
}
