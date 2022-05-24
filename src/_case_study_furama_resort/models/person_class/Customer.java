package _case_study_furama_resort.models.person_class;

public class Customer extends Person {
    private String typeOfGuest;
    private String address;

    public Customer() {
    }

    public Customer(int id, String name, String dateOfBirth,
                    String gender, int idCar, int phoneNumber, String email, String typeOfGuest, String address) {
        super(id, name, dateOfBirth, gender, idCar, phoneNumber, email);
        this.typeOfGuest = typeOfGuest;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" + super.toString() +
                "typeOfGuest='" + typeOfGuest + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
