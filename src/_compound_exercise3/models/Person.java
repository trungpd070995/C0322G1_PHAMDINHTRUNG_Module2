package _compound_exercise3.models;

public abstract class Person implements Comparable<Person>{
    private String id;
    private String hoVaTen;
    private String gioiTinh;
    private String ngaySinh;
    private String diaChi;

    public Person() {
    }

    public Person(String id, String hoVaTen, String gioiTinh, String ngaySinh, String diaChi) {
        this.id = id;
        this.hoVaTen = hoVaTen;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
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
        return
                " Id = '" + id + '\'' +
                ", Họ và Tên: '" + hoVaTen + '\'' +
                ", Giới Tính: '" + gioiTinh + '\'' +
                ", Ngày sinh: '" + ngaySinh + '\'' +
                ", Địa chỉ: '" + diaChi + '\'' ;
    }

    public abstract String getInfor();

    @Override
    public int compareTo(Person o) {
        return o.getHoVaTen().compareTo(getHoVaTen());
    }
}
