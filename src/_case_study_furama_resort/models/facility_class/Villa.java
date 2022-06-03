package _case_study_furama_resort.models.facility_class;

public class Villa extends Facility {
    private String standardRoom; //Tiêu chuẩn phòng
    private double poolArea; //Diện tích hồ bơi
    private int numberFloors; //Số tầng

    public Villa() {
    }

    public Villa(String id, String serviceName, double usableArea, String rentalCosts, int maximumPeople, String retalType, String standardRoom, double poolArea, int numberFloors) {
        super(id,serviceName, usableArea, rentalCosts, maximumPeople, retalType);
        this.standardRoom = standardRoom;
        this.poolArea = poolArea;
        this.numberFloors = numberFloors;
    }

    public Villa(String id, String name, double usableArea, double rentCost, double amount, String rentType, String room, double area, int floor) {
    }

    public String getStandardRoom() {
        return standardRoom;
    }

    public void setStandardRoom(String standardRoom) {
        this.standardRoom = standardRoom;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
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
        return " Villa {" +
                "standardRoom='" + standardRoom + '\'' +
                ", poolArea=" + poolArea +
                ", numberFloors=" + numberFloors + super.toString() +
                '}';
    }
}
