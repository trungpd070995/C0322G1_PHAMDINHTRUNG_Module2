package _compound_exercises.models;

public class NhanVienCongNhat extends NhanVien {
    private int soNgayCong;

    public NhanVienCongNhat() {
    }

    public NhanVienCongNhat(int soNgayCong) {
        this.soNgayCong = soNgayCong;
    }

    public NhanVienCongNhat(String ten, String ngaySinh, String diaChi, int soNgayCong) {
        super(ten, ngaySinh, diaChi);
        this.soNgayCong = soNgayCong;
    }

    @Override
    public String toString() {
        return "Nhân Viên Công Nhật: {" +
                " soNgayCong = " + soNgayCong + " " + super.toString() +
                '}';
    }

    @Override
    public double tinhLuong() {
        return this.soNgayCong * 12000;
    }
}
