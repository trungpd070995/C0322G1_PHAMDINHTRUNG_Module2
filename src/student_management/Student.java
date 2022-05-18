package student_management;

public class Student extends Person {
    private int point;

    public Student() {
    }

    public Student(int id, String name, int age, String gender) {
        super(id, name, age, gender);
    }


    public Student(int id, String name, int age, String gender, int point) {
        super(id, name, age, gender);
        this.point = point;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    @Override
    public String toString() {
        return "Student{" +
                ", id =" + super.getId() +
                ", name =" + super.getName() +
                ", age =" + super.getAge() +
                ", gender =" + super.getGender() +
                ", point =" + getPoint() +
                '}';
    }
}
