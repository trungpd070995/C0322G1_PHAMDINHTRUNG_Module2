package _compound_exercise2.models;

public abstract class NhanVien {
   private String id;
   private String maNhanVien;
   private String hoVaTen;
   private String ngaySinh;
   private String diaChi;

    public NhanVien() {
    }

    public NhanVien(
            String id, String maNhanVien, String hoVaTen, String ngaySinh, String diaChi) {
        this.id = id;
        this.maNhanVien = maNhanVien;
        this.hoVaTen = hoVaTen;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    @Override
    public String toString() {
        return "NhanVien{" +
                "id='" + id + '\'' +
                ", maNhanVien='" + maNhanVien + '\'' +
                ", hoVaTen='" + hoVaTen + '\'' +
                ", ngaySinh='" + ngaySinh + '\'' +
                ", diaChi='" + diaChi + '\'' +
                '}';
    }

    public abstract String getInfor();
}
