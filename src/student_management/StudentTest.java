package student_management;

import java.util.Arrays;
import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) {
        int i = -1;
        Scanner scanner = new Scanner(System.in);
        Person[] persons = new Person[50];

        int choice = -1;

        while (choice != 4) {
            System.out.println("*****MENU QUẢN LÝ NHÂN VIÊN & HỌC VIÊN*****");
            System.out.println("0. Hiển thị danh sách !");
            System.out.println("1. Thêm Sinh viên");
            System.out.println("2. Thêm Giáo viên");
            System.out.println("3. Tìm kiếm ");
            System.out.println("4. Xoá ");
            System.out.println("5. Thoát ");
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 0:
                    display(persons);
                    break;
                case 1:
                    i++;
                    addNewStudent(persons, i);
                    break;

                case 2:
                    i++;
                    addNewTeacher(persons, i);
                    break;
                case 3:
                    search(persons);
                    break;
                case 4:
                    remove(persons);
                    System.out.println("Danh sách sau khi xoá là :");
                    display(persons);
                    break;

                case 5:
                    System.exit(5);
            }
        }
    }

    public static void display(Person[] persons) {
        int count = 0;
        for (Person person : persons) {
            if (person != null) {
                count++;
                if (person instanceof Student) {
                    Student student = (Student) person;
                    System.out.println(student.toString());
                }
                if (person instanceof Teacher) {
                    Teacher teacher = (Teacher) person;
                    System.out.println(teacher.toString());
                }
            }
        }
        if (count == 0) {
            System.out.println("Mảng rỗng ! Hãy thêm mới !");
        }
    }

    public static void addNewStudent(Person[] persons, int i) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào id");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vào tên sinh viên muốn thêm :");
        String name = scanner.nextLine();
        System.out.println("Nhập vào tuổi sinh viên :");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vào giới tính sinh viên :");
        String gender = scanner.nextLine();
        System.out.println("Nhập vào điểm sinh viên :");
        int point = Integer.parseInt(scanner.nextLine());
        persons[i] = new Student(id, name, age, gender, point);
        System.out.println("Đã thêm mới thành công !");
    }

    public static void addNewTeacher(Person[] persons, int i) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào id giáo viên :");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vào tên giáo viên :");
        String name = scanner.nextLine();
        System.out.println("Nhập tuổi :");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vào giới tính :");
        String gender = scanner.nextLine();
        System.out.println("Nhập lương :");
        int salary = Integer.parseInt(scanner.nextLine());
        persons[i] = new Teacher(id, name, age, gender, salary);
        System.out.println("Đã thêm mới thành công!");
    }

    public static void remove(Person[] persons) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên muốn xoá !");
        String deleteName = scanner.nextLine();
        for (int j = 0; j < persons.length; j++) {
            if (persons[j] != null && persons[j].getName().equals(deleteName)) {
                persons[j] = null;
            }
        }
    }

    public static void search(Person[] persons) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên muốn tìm kiếm");
        String searchName = scanner.nextLine();
        for (Person person : persons) {
            if (person != null && person.getName().equals(searchName)) {
                System.out.println(person);
            }
        }
    }
}
