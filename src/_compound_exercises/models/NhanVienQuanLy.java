package _compound_exercises.models;

import _compound_exercises.service.ChamCongNhanVien;

public class NhanVienQuanLy extends NhanVien implements ChamCongNhanVien {
    private double luongCoBan;
    private double heSoLuong;

    public NhanVienQuanLy() {
    }

    public NhanVienQuanLy(int luongCoBan, int heSoLuong) {
        this.luongCoBan = luongCoBan;
        this.heSoLuong = heSoLuong;
    }

    public NhanVienQuanLy(String ten, String ngaySinh, String diaChi, int luongCoBan, int heSoLuong) {
        super(ten, ngaySinh, diaChi);
        this.luongCoBan = luongCoBan;
        this.heSoLuong = heSoLuong;
    }

    public double getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(double luongCoBan) {
        this.luongCoBan = luongCoBan;
    }

    public double getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(double heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    @Override
    public String toString() {
        return "Nhân Viên Quản Lý {" +
                " luongCoBan = " + luongCoBan +
                ", heSoLuong = " + heSoLuong + " " + super.toString() + tinhLuong() +
                '}';
    }

    @Override
    public double tinhLuong() {
        return this.luongCoBan * this.heSoLuong;
    }

    @Override
    public void chamCongNhanVien() {

    }
}
