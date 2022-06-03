package _case_study_furama_resort.models.person_class;

public class Employee extends Person {
    private String location;
    private int salary;
    private String level;

    public Employee() {
    }

    public Employee(int id, String name, String dateOfBirth, String gender,
                    int idCar, int phoneNumber, String email, String location, int salary, String level) {
        super(id, name, dateOfBirth, gender, idCar, phoneNumber, email);
        this.location = location;
        this.salary = salary;
        this.level = level;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return " Employee {" +
                super.toString() +
                "location='" + location + '\'' +
                ", salary=" + salary +
                ", level='" + level + '\'' +
                '}';
    }
}
