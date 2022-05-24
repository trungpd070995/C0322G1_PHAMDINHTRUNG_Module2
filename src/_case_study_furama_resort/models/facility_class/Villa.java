package _case_study_furama_resort.models.facility_class;

public class Villa extends Facility {
    private String standardRoom; //Tiêu chuẩn phòng
    private int poolArea; //Diện tích hồ bơi
    private int numberFloors; //Số tầng

    public Villa() {
    }

    public Villa(String serviceName, int usableArea, int rentalCosts, int maximumPeople, String retalType, String standardRoom, int poolArea, int numberFloors) {
        super(serviceName, usableArea, rentalCosts, maximumPeople, retalType);
        this.standardRoom = standardRoom;
        this.poolArea = poolArea;
        this.numberFloors = numberFloors;
    }

    public String getStandardRoom() {
        return standardRoom;
    }

    public void setStandardRoom(String standardRoom) {
        this.standardRoom = standardRoom;
    }

    public int getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(int poolArea) {
        this.poolArea = poolArea;
    }

    public int getNumberFloors() {
        return numberFloors;
    }

    public void setNumberFloors(int numberFloors) {
        this.numberFloors = numberFloors;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "standardRoom='" + standardRoom + '\'' +
                ", poolArea=" + poolArea +
                ", numberFloors=" + numberFloors + super.toString() +
                '}';
    }
}
