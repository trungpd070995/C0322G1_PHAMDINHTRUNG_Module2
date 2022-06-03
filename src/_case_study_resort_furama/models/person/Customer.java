package _case_study_resort_furama.models.person;

public class Customer extends Person {
    private String typeOfGuest;
    private String address;
    private String idCustomer;

    public Customer(String typeOfGuest, String address, String idCustomer) {
        this.typeOfGuest = typeOfGuest;
        this.address = address;
        this.idCustomer = idCustomer;
    }

    public Customer( String name, String age, boolean gender, String phoneNumber,
                     String email, int idCard, String typeOfGuest, String address, String idCustomer) {
        super( name, age, gender,phoneNumber, email, idCard);
        this.typeOfGuest = typeOfGuest;
        this.address = address;
        this.idCustomer = idCustomer;
    }

    public String getTypeOfGuest() {
        return typeOfGuest;
    }

    public void setTypeOfGuest(String typeOfGuest) {
        this.typeOfGuest = typeOfGuest;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
    }

    @Override
    public String toString() {
        return  super.toString() +"Customer{" +
                "typeOfGuest='" + typeOfGuest + '\'' +
                ", address='" + address + '\'' +
                ", idCustomer='" + idCustomer + '\'' +
                '}';
    }
}