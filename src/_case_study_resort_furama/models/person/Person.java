package _case_study_resort_furama.models.person;

public  abstract class Person {
    public String name;
    public String age;
    public boolean gender;
    public String phoneNumber;
    public String email;
    public int idCard;

    public Person() {
    }

    public Person(String name, String age, boolean gender, String phoneNumber, String email, int idCard) {

        this.name = name;
        this.age = age;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.idCard = idCard;
    }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdCard() {
        return idCard;
    }

    public void setIdCard(int idCard) {
        this.idCard = idCard;
    }

    @Override
    public String toString() {
        return " Person :"
                + "name :"+ name +"\t"
                + " age :"+ age+ "\t"
                + "gender :"+ gender+ "\t"
                + "phoneNumber :"+ phoneNumber+ "\t"
                + "email : :"+ email+ "\t"
                + "idCard :"+ idCard ;
    }
}