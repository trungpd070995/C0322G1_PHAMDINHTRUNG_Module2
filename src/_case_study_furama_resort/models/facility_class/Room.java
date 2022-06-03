package _case_study_furama_resort.models.facility_class;

public class Room extends Facility {
    private String freeServices; //Dịch vụ miễn phí đi kèm

    public Room() {
    }

    public Room(String id, String serviceName, double usableArea, String rentalCosts, int maximumPeople, String retalType, String freeServices) {
        super(id,serviceName, usableArea, rentalCosts, maximumPeople, retalType);
        this.freeServices = freeServices;
    }

    public String getFreeServices() {
        return freeServices;
    }

    public void setFreeServices(String freeServices) {
        this.freeServices = freeServices;
    }

    @Override
    public String toString() {
        return " Room {" +
                "freeServices='" + freeServices + super.toString() + '\'' +
                '}';
    }
}
