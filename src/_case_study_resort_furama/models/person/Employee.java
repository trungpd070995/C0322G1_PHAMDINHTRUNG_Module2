package _case_study_resort_furama.models.person;

public class Employee extends Person implements Comparable<Employee> {
    private int id;
    private String level;
    private String position;
    private double salary;

    public Employee() {
    }

    public Employee( int id ,String level, String position, double salary) {
        this.id = id;
        this.level = level;
        this.position = position;
        this.salary = salary;
    }

    public Employee(
            int id,
            String name,
            String age,
            boolean gender,
            String phoneNumber,
            String email,
            int idCard,
            String level,
            String position,
            double salary
    ) {
        super( name, age, gender, phoneNumber, email, idCard );
        this.level = level;
        this.position = position;
        this.salary = salary;
        this.id = id; ;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public int compareTo(Employee employee) {
        return this.getId() - employee.getId();
    }

    @Override
    public String toString() {
        return  "***EMPLOYEE {" +
                "ID:"+ id + "\t"+
                "Tên:"+ super.getName() + "\t"+
                "Ngày Sinh:"+ super.getAge() + "\t"+
                "Giới Tính:"+ super.isGender() + "\t"+
                "Số điện thoại:"+ super.getPhoneNumber() + "\t"+
                "Email:"+ super.getEmail() + "\t"+
                "Chứng minh thư:"+ super.getIdCard() + "\t"+
                "Level:"+ level + '\'' +
                "Position:"+ position + '\'' +
                "Salary:"+ salary +
                '}';
    }
}