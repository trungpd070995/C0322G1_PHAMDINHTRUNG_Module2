package _compound_exercise2.models;

public class NhanVienQuanLy extends NhanVien{
   private double luongCoBan;
   private double heSoLuong;

    public NhanVienQuanLy() {
    }

    public NhanVienQuanLy(
            String id, String maNhanVien, String hoVaTen, String ngaySinh, String diaChi, double luongCoBan, double heSoLuong) {
        super(id, maNhanVien, hoVaTen, ngaySinh, diaChi);
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
        return "NhanVienQuanLy{" +
                "luongCoBan=" + luongCoBan +
                ", heSoLuong=" + heSoLuong +
                '}';
    }

    @Override
    public String getInfor() {
         return super.getId() + ","
                + super.getMaNhanVien() + ","
                + super.getHoVaTen() + ","
                + super.getNgaySinh() + ","
                + super.getDiaChi() + ","
                + this.luongCoBan + ","
                + this.heSoLuong + ","
                + "1";
    }
}
