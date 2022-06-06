package _compound_exercise2.models;

public class NhanVienSanXuat extends NhanVien {
    private int soSanPham;
    private double giaMoiSanPham;

    public NhanVienSanXuat() {
    }

    public NhanVienSanXuat(
            String id, String maNhanVien, String hoVaTen, String ngaySinh, String diaChi, int soSanPham, double giaMoiSanPham) {
        super(id, maNhanVien, hoVaTen, ngaySinh, diaChi);
        this.soSanPham = soSanPham;
        this.giaMoiSanPham = giaMoiSanPham;
    }

    public int getSoSanPham() {
        return soSanPham;
    }

    public void setSoSanPham(int soSanPham) {
        this.soSanPham = soSanPham;
    }

    public double getGiaMoiSanPham() {
        return giaMoiSanPham;
    }

    public void setGiaMoiSanPham(double giaMoiSanPham) {
        this.giaMoiSanPham = giaMoiSanPham;
    }

    @Override
    public String toString() {
        return "NhanVienSanXuat{" +
                "soSanPham=" + soSanPham +
                ", giaMoiSanPham=" + giaMoiSanPham +
                '}';
    }

    @Override
    public String getInfor() {
        return super.getId() + ","
                + super.getMaNhanVien() + ","
                + super.getHoVaTen() + ","
                + super.getNgaySinh() + ","
                + super.getDiaChi() + ","
                + this.soSanPham + ","
                + this.giaMoiSanPham + ","
                + "2";
    }

}

