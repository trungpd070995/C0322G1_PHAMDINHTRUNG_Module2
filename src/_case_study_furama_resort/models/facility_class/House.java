package _case_study_furama_resort.models.facility_class;

public class House extends Facility {
    private String standardHouse; //Tiêu chuẩn phòng
    private int numberFloors; //Số tầng

    public House() {
    }

    public House(String id, String serviceName, double usableArea, String rentalCosts, int maximumPeople, String retalType, String standardHouse, int numberFloors) {
        super(id,serviceName, usableArea, rentalCosts, maximumPeople, retalType);
        this.standardHouse = standardHouse;
        this.numberFloors = numberFloors;
    }

    public String getStandardHouse() {
        return standardHouse;
    }

    public void setStandardHouse(String standardHouse) {
        this.standardHouse = standardHouse;
    }

    public int getNumberFloors() {
        return numberFloors;
    }

    public void setNumberFloors(int numberFloors) {
        this.numberFloors = numberFloors;
    }

    @Override
    public String toString() {
        return " House {" +
                "standardHouse='" + standardHouse + '\'' +
                ", numberFloors=" + numberFloors + super.toString() +
                '}';
    }
}
