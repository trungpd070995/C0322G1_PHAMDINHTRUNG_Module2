package _compound_exercise3.service.impl;

import _compound_exercise2.exception.NotFoundException;
import _compound_exercise2.ultils.ReadAndWriteFile;
import _compound_exercise2.ultils.Regex;
import _compound_exercise3.models.Person;
import _compound_exercise3.models.Student;
import _compound_exercise3.models.Teacher;
import _compound_exercise3.service.Service;
import _compound_exercise3.ultils.CompareTorPerson;
import _compound_exercise3.ultils.ReadAndWriteFilePerSon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import static java.lang.Double.parseDouble;


public class ServiceImpl implements Service {
    static List<Person> people = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    @Override
    public void display() {
        readFile();
        for (Person person : people) {
            System.out.println(person);
        }
    }

    @Override
    public void addNewTeacher() {
        readFile();
        people.add(new Teacher(getId(), getHoVaTen(), getGioiTinh(), getNgaySinh(), getDiaChi(), getLopDay(), getLuongGioDay(), getSoGioDay()));
        System.out.println("Thêm mới thành công");
        writeFile();
    }

    @Override
    public void addNewStudent() {
        readFile();
        people.add(new Student(getId(), getHoVaTen(), getGioiTinh(), getNgaySinh(), getDiaChi(), getMaSinhVien(), getDiemTrungBinh()));
        System.out.println("Thêm mới thành công");
        writeFile();
    }

    @Override
    public void remove() {
        readFile();
        System.out.println("Nhập id bạn muốn xóa");
        String id = scanner.nextLine();
        for (Person person : people) {
            if (person.getId().equals(id)) {
                System.out.println("Bạn muốn xóa " + person);
                do {
                    System.out.println("1. Yes   " + "   2.No");
                    String choose = scanner.nextLine();
                    switch (choose) {
                        case "1":
                            people.remove(person);
                            System.out.println("Đã xóa thành công");
                            writeFile();
                            return;
                        case "2":
                            System.out.println("Xóa không thành công");
                            return;
                        default:
                            System.out.println("Vui lòng chọn lại !");
                    }
                } while (true);

            }
        }
        try {
            throw new NotFoundException("Id không tồn tại");
        } catch (NotFoundException e) {
            System.err.println(e.getMessage());
        }
    }

    @Override
    public void sort() {
        readFile();
        Collections.sort(people, new CompareTorPerson());
        for (Person person : people) {
            System.out.println(person);
        }
    }

    @Override
    public void edit() {
        readFile();
        System.out.println("Nhập id cần chỉnh sửa:");
        String id = scanner.nextLine();
        for (Person item : people) {
            if (id.equals(item.getId())){
                System.out.println("Nhập họ và tên:");
                String name = scanner.nextLine();
                item.setHoVaTen(name);

            }
        }
    }


    public String getId() {
        System.out.println("Nhập id: ");
        String id = scanner.nextLine();
        return id;
    }

    public String getHoVaTen() {
        do {
            System.out.println("Nhập họ và tên: ");
            String temp = scanner.nextLine();
            if (!temp.equals("")) {
                return temp;
            }
        } while (true);
    }

    public String getGioiTinh() {
        System.out.println("Nhập giới tính: ");
        String gender = scanner.nextLine();
        return gender;
    }

    public String getNgaySinh() {
        do {
            System.out.println("Nhập ngày sinh");
            String dayOfBirth = scanner.nextLine();
            if (Regex.regexDate(dayOfBirth)) {
                if (Regex.regexBirthDay(dayOfBirth)) {
                    return dayOfBirth;
                } else {
                    System.out.println("Ngày sinh phải trên 18 tuổi và dưới 100");
                }
            } else {
                System.out.println("Ngày sinh phải đúng định dạng dd/MM/yyyy");
            }
        } while (true);
    }

    public String getDiaChi() {
        do {
            System.out.println("Nhập địa chỉ");
            String address = scanner.nextLine();
            if (!address.equals("")) {
                return address;
            }
        } while (true);
    }

    public String getMaSinhVien() {
        do {
            System.out.println("Nhập mã sinh viên");
            String temp = scanner.nextLine();
            if (!temp.equals("")) {
                return temp;
            }
        } while (true);
    }

    private double getDiemTrungBinh() {
        System.out.println("Nhập điểm trung bình :");
        String diemTrungBinh = scanner.nextLine();
        return parseDouble(diemTrungBinh);
    }

    private String getLopDay() {
        System.out.println("Nhập lớp");
        String lopDay = scanner.nextLine();
        return lopDay;
    }

    private double getLuongGioDay() {
        System.out.println("Lương 1 giờ dạy :");
        String luong = scanner.nextLine();
        return parseDouble(luong);
    }

    private String getSoGioDay() {
        System.out.println("Số giờ dạy : ");
        String soGioDay = scanner.nextLine();
        return soGioDay;
    }

    public void readFile() {
        people.clear();
        List<String[]> peoples = ReadAndWriteFilePerSon.readFile("src\\_compound_exercise3\\data\\data.csv");
        for (String[] line : peoples) {
            if (line[0].equals("1")) {
                people.add(new Teacher(line[1], line[2], line[3], line[4], line[5], line[6], parseDouble(line[7]), line[8]));
            } else {
                if (line[0].equals("2")) {
                    people.add(new Student(line[1], line[2], line[3], line[4], line[5], line[6], parseDouble(line[7])));
                }
            }
        }
    }

    public void writeFile() {
        ReadAndWriteFilePerSon.clearFile("src\\_compound_exercise3\\data\\data.csv");
        for (Person person : people) {
            ReadAndWriteFilePerSon.writeFile("src\\_compound_exercise3\\data\\data.csv", person.getInfor());
        }
    }

}
