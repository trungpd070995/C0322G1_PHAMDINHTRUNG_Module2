package student_management;

public class Teacher extends Person {
    private int salary;

    public Teacher() {
    }

    public Teacher(int id, String name, int age, String gender, int salary) {
        super(id, name, age, gender);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                ", id =" + super.getId() +
                ", name =" + super.getName() +
                ", age =" + super.getAge() +
                ", gender =" + super.getGender() +
                ", salary =" + getSalary() +
                '}';
    }
}
