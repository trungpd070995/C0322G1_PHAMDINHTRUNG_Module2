package _compound_exercise3.models;

public class Teacher extends Person {
    private String lopDay;
    private double luongMotGioDay;
    private String soGioDay;

    public Teacher() {
    }

    public Teacher(String id, String hoVaTen, String gioiTinh, String ngaySinh, String diaChi, String lopDay, double luongMotGioDay, String soGioDay) {
        super(id, hoVaTen, gioiTinh, ngaySinh, diaChi);
        this.lopDay = lopDay;
        this.luongMotGioDay = luongMotGioDay;
        this.soGioDay = soGioDay;
    }

    public Teacher(String lopDay, double luongMotGioDay, String soGioDay) {
        this.lopDay = lopDay;
        this.luongMotGioDay = luongMotGioDay;
        this.soGioDay = soGioDay;
    }

    public String getLopDay() {
        return lopDay;
    }

    public void setLopDay(String lopDay) {
        this.lopDay = lopDay;
    }

    public double getLuongMotGioDay() {
        return luongMotGioDay;
    }

    public void setLuongMotGioDay(double luongMotGioDay) {
        this.luongMotGioDay = luongMotGioDay;
    }

    public String getSoGioDay() {
        return soGioDay;
    }

    public void setSoGioDay(String soGioDay) {
        this.soGioDay = soGioDay;
    }

    @Override
    public String toString() {
        return "Teacher{" + super.toString() +
                ", Lớp dạy: " + lopDay +
                ", Lương 1 giờ dạy: " + luongMotGioDay +
                ", Số giờ dạy: " + soGioDay +
                '}';
    }

    @Override
    public String getInfor() {
        return "1," + super.getId() + ","
                + super.getHoVaTen() + ","
                + super.getGioiTinh() + ","
                + super.getNgaySinh() + ","
                + super.getDiaChi() + ","
                + this.lopDay + ","
                + this.luongMotGioDay + ","
                + this.soGioDay + ","
                 ;
    }
}
