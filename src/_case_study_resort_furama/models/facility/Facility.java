package _case_study_resort_furama.models.facility;

import java.util.Objects;

public  abstract class Facility {
    private String id;
    private String name;
    private double area;
    private double rentalCost;
    private String quantity;
    private String rentalType;

    public Facility() {
    }

    public Facility(String id, String name, double area, double rentalCost,
                    String quantity, String rentalType) {
        this.id = id;
        this.name = name;
        this.area = area;
        this.rentalCost = rentalCost;
        this.quantity = quantity;
        this.rentalType = rentalType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getRentalCost() {
        return rentalCost;
    }

    public void setRentalCost(double rentalCost) {
        this.rentalCost = rentalCost;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Facility facility = (Facility) o;
        return Double.compare(facility.area, area) == 0 &&
                Double.compare(facility.rentalCost, rentalCost) == 0 &&
                id.equals(facility.id) &&
                name.equals(facility.name) &&
                quantity.equals(facility.quantity) &&
                rentalType.equals(facility.rentalType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, area, rentalCost, quantity, rentalType);
    }

    @Override
    public String toString() {
        return "Facility {" +
                " id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", area='" + area + '\'' +
                ", rentalCost='" + rentalCost + '\'' +
                ", quantity=" + quantity +
                ", rentalType=" + rentalType +
                '}';
    }

}