package _compound_exercise3.models;

public class Student extends Person{
    private String maSinhVien;
    private double diemTrungBinh;

    public Student() {
    }

    public Student(String id, String hoVaTen, String gioiTinh, String ngaySinh, String diaChi, String maSinhVien, double diemTrungBinh) {
        super(id, hoVaTen, gioiTinh, ngaySinh, diaChi);
        this.maSinhVien = maSinhVien;
        this.diemTrungBinh = diemTrungBinh;
    }

    public Student(String maSinhVien, double diemTrungBinh) {
        this.maSinhVien = maSinhVien;
        this.diemTrungBinh = diemTrungBinh;
    }

    public String getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public double getDiemTrungBinh() {
        return diemTrungBinh;
    }

    public void setDiemTrungBinh(double diemTrungBinh) {
        this.diemTrungBinh = diemTrungBinh;
    }



    @Override
    public String toString() {
        return "Student{" + super.toString() +
                ", Mã Sinh Viên: " + maSinhVien +
                ", Điểm trung bình: " + diemTrungBinh +
                '}';
    }

    @Override
    public String getInfor() {
        return "2," + super.getId() + ","
                + super.getHoVaTen() + ","
                + super.getGioiTinh() + ","
                + super.getNgaySinh() + ","
                + super.getDiaChi() + ","
                + this.maSinhVien +","
                + this.diemTrungBinh+","
                ;
    }


}
