package _case_study_resort_furama.services.implement;

import _case_study_resort_furama.models.person.Employee;
import _case_study_resort_furama.services.service.EmployeeService;
import _case_study_resort_furama.ultils.RegexData;
import _case_study_resort_furama.ultils.WriteAndReadFile;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {
    private static List<Employee> employees = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    private static final String FILE_EMPLOYEE = "src\\_case_study_resort_furama\\data\\employee.csv";
    private static final String FILE_NAME = "^[A-Z][a-z]+$";
    private static final String FILE_PHONE = "^0[0-9]{9,}$";
    private static final String FILE_BIRTH ="^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/|-|\\.)(?:0?[13-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$" ;
    private static List<String[]> list;

    public int checkId() {

        if (employees.size() == 0) {
            return  1;
        } else {
            return employees.get(employees.size( )- 1).getId() + 1;
        }
    }

    @Override
    public void display() {
        list = WriteAndReadFile.readFile(FILE_EMPLOYEE);
        employees.clear();
        Employee employee;
        for (String[] item: list) {
            employee = new Employee(item[0],
                    item[1],
                    Boolean.parseBoolean(item[2]),
                    item[3],item[4],Integer.parseInt(item[5]),
                    Integer.parseInt(item[6]),item[7],item[8],Double.parseDouble(item[9]));
            employees.add(employee);

        }
        for (Employee item : employees) {
            System.out.println(item.toString());
        }
    }

    private String inputName(){
        System.out.println("Nhập tên nhân viên :");
        return RegexData.regexString(FILE_NAME);
    }

    private String inputPhone(){
        System.out.println("Nhập số diện thoại nhân viên :");
        return RegexData.regexPhone(FILE_PHONE);
    }

    @Override
    public void addNew() {

        list = WriteAndReadFile.readFile(FILE_EMPLOYEE);

        String name = inputName();

        System.out.println("Nhập tuổi :");
        String dateOfBirth = RegexData.regexAge(scanner.nextLine(),FILE_BIRTH);
        System.out.println("1.Nam    2.Nữ   ");
        boolean gender = false;
        int choice1 = Integer.parseInt(scanner.nextLine());
        if(choice1 == 1){
            gender = true;
        }

        String phoneNumber = inputPhone();

        System.out.println("Nhập địa chỉ email :");
        String email = scanner.nextLine();

        System.out.println("Nhập số CMND :");
        int idCard = Integer.parseInt(scanner.nextLine());

        int id = this.checkId();

        System.out.println(" Trình độ :");
        System.out.println(" 1.Intermediate        2.Colleges         3.University      4. After University");
        String level = "";
        String choice = scanner.nextLine();
        boolean check = true;

        while (check) {
            switch (choice) {
                case "1":
                    level += "Intermediate";
                    check = false;
                    break;
                case "2":
                    level += "Colleges";
                    check = false;
                    break;
                case "3":
                    level += "University";
                    check = false;
                    break;
                case "4":
                    level += "After University ";
                    check = false;
                    break;
                default:
                    System.out.println("Nhập lại :");
                    choice = scanner.nextLine();
            }


        }

        System.out.println("Chức vụ hiện tại :");
        System.out.println("1.\tReceptionist   2.\tServe   3.\tExpert   4.\tMonitoring   5.\tManager   6.\tDirector");
        String position = "";
        boolean flag = true;
        String indexChoice = scanner.nextLine();
        while (flag) {
            switch (indexChoice) {
                case "1":
                    position += "Receptionist";
                    flag = false;
                    break;
                case "2":
                    position += "Serve";
                    flag = false;
                    break;
                case "3":
                    position += "Expert";
                    flag = false;
                    break;
                case "4":
                    position += "Monitoring";
                    flag = false;
                    break;
                case "5":
                    position += "Manager";
                    flag = false;
                    break;
                case "6":
                    position += "Director";
                    flag = false;
                    break;
                default:
                    System.out.println("Mời nhập lại");
                    indexChoice = scanner.nextLine();
            }

        }
        System.out.println("Nhập lương :");
        double salary = Double.parseDouble(scanner.nextLine());

        String line =   name +"," + dateOfBirth + "," + gender + ","
                + phoneNumber +"," + email + "," +idCard +","+ id + ","
                +level +"," + position + "," +  salary  ;
        WriteAndReadFile.writeFile(FILE_EMPLOYEE,line);
    }




    @Override
    public void edit() {
        display();
        File file = new File(FILE_EMPLOYEE);
        list = WriteAndReadFile.readFile(FILE_EMPLOYEE);
        file.delete();
        System.out.println("Nhập id nhân viên muốn sửa thông tin :");
        int id = Integer.parseInt(scanner.nextLine());
        boolean check = false;
        for (Employee item : employees) {
            if (item.getId() == id) {
                check = true;
                System.out.println(item);
                String name = inputName();
                item.setName(name);
                System.out.println("Nhập tuổi:");
                String age = RegexData.regexAge(scanner.nextLine(),FILE_BIRTH);
                item.setAge(age);
                System.out.println("1.Nam    2.Nữ   ");
                boolean gender = false;
                int choice1 = Integer.parseInt(scanner.nextLine());
                if (choice1 == 1) {
                    gender = true;
                }
                item.setGender(gender);

                String phoneNumber = inputPhone();
                item.setPhoneNumber(phoneNumber);

                System.out.println("Nhập email :");
                item.setEmail(scanner.nextLine());

                System.out.println("Nhập số CMND :");
                item.setIdCard(Integer.parseInt(scanner.nextLine()));

                System.out.println(" Trình độ :");
                System.out.println(" 1.Intermediate        2.Colleges         3.University      4. After University");
                String level = "";
                String choice = scanner.nextLine();
                boolean check1 = true;
                while (check1) {
                    switch (choice) {
                        case "1":
                            level += "Intermediate";
                            check1 = false;
                            break;
                        case "2":
                            level += "Colleges";
                            check1 = false;
                            break;
                        case "3":
                            level += "University";
                            check1 = false;
                            break;
                        case "4":
                            level += "After University ";
                            check1 = false;
                            break;
                        default:
                            System.out.println("Nhập lại :");
                            choice = scanner.nextLine();
                    }


                }
                item.setLevel(level);

                System.out.println("Chức vụ hiện tại :");
                System.out.println("1.\tReceptionist   2.\tServe   3.\tExpert   4.\tMonitoring   5.\tManager   6.\tDirector");
                String position = "";
                boolean flag = true;
                String indexChoice = scanner.nextLine();
                while (flag) {
                    switch (indexChoice) {
                        case "1":
                            position += "Receptionist";
                            flag = false;
                            break;
                        case "2":
                            position += "Serve";
                            flag = false;
                            break;
                        case "3":
                            position += "Expert";
                            flag = false;
                            break;
                        case "4":
                            position += "Monitoring";
                            flag = false;
                            break;
                        case "5":
                            position += "Manager";
                            flag = false;
                            break;
                        case "6":
                            position += "Director";
                            flag = false;
                            break;
                        default:
                            System.out.println("Mời nhập lại");
                            indexChoice = scanner.nextLine();
                    }
                }
                item.setPosition(position);
                System.out.println("Nhập lương :");
                item.setSalary(Double.parseDouble(scanner.nextLine()));

            }

            String line =  item.getName()+","+ item.getAge()+","+item.isGender()+","+item.getPhoneNumber()+","+item.getEmail()
                    +"," +item.getIdCard()+","+ item.getId() +","+ item.getLevel()+","+item.getPosition()+","+item.getSalary();
           WriteAndReadFile.writeFile(FILE_EMPLOYEE,line);
            System.out.println("Đã chỉnh sửa thông tin thành công !");
        }

        if (!check) {
            System.err.println("Không có Id này trong danh sách !");
        }
    }

    @Override
    public void remove() {
    }
}
