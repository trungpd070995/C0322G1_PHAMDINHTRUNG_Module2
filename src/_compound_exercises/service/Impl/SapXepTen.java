package _compound_exercises.service.Impl;

import _compound_exercises.models.NhanVien;

import java.util.Comparator;

public class SapXepTen implements Comparator<NhanVien> {
    @Override
    public int compare(NhanVien o1, NhanVien o2) {
        if (o1.getTen().compareTo(o2.getTen()) > 0) {
            return 1;
        } else {
            return -1;
        }
    }
}
