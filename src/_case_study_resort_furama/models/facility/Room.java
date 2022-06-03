package _case_study_resort_furama.models.facility;

public class Room extends Facility {
    private String freeService;

    public Room() {

    }

    public Room(String freeService) {
        this.freeService = freeService;
    }

    public Room(String id, String name, double area, double rentalCost, String quantity, String rentalType, String freeService) {
        super(id, name, area, rentalCost, quantity, rentalType);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return super.toString() + "Room{" +
                "freeService='" + freeService + '\'' +
                '}';
    }
}
