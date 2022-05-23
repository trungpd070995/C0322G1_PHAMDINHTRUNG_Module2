package _compound_exercises.models;

import _compound_exercises.service.ChamCongNhanVien;

public class NhanVienSanXuat extends NhanVien implements ChamCongNhanVien {
    private int soSanPham;

    public NhanVienSanXuat() {
    }

    public NhanVienSanXuat(int soSanPham) {
        this.soSanPham = soSanPham;
    }

    public NhanVienSanXuat(String ten, String ngaySinh, String diaChi, int soSanPham) {
        super(ten, ngaySinh, diaChi);
        this.soSanPham = soSanPham;
    }

    public int getSoSanPham() {
        return soSanPham;
    }

    public void setSoSanPham(int soSanPham) {
        this.soSanPham = soSanPham;
    }

    @Override
    public String toString() {
        return "Nhân Viên Sản Xuất: {" +
                " soSanPham = " + soSanPham + " " + super.toString() +
                '}';
    }

    @Override
    public double tinhLuong() {
        return this.soSanPham * 50000;
    }

    @Override
    public void chamCongNhanVien() {

    }
}
