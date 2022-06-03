package _case_study_resort_furama.services.implement;

import _case_study_resort_furama.models.person.Customer;
import _case_study_resort_furama.services.service.CustomerService;
import _case_study_resort_furama.ultils.RegexData;
import _case_study_resort_furama.ultils.WriteAndReadFile;

import java.io.File;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements CustomerService {
    private static List<Customer> customers = new LinkedList<>();
    private static Scanner scanner = new Scanner(System.in);
    private static List<String[]> list;
    private static final String FILE_CUSTOMER = "src\\_case_study_resort_furama\\data\\custommer.csv";
    private static final String FILE_NAME = "^[A-Z][a-z]+$";
    private static final String FILE_PHONE = "^0[0-9]{9,}$";
    private static final String FILE_BIRTH = "^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/|-|\\.)(?:0?[13-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$";
    private static final String FILE_EMAIL = "([A-Za-z0-9]+[.-_])*[A-Za-z0-9]+@[A-Za-z0-9-]+(\\.[A-Z|a-z]{2,})+";

    @Override
    public void display() {
        list = WriteAndReadFile.readFile(FILE_CUSTOMER);
        customers.clear();
        Customer customer;
        for (String[] item : list) {
            customer = new Customer(item[0], item[1], Boolean.parseBoolean(item[2]), item[3], item[4],
                    Integer.parseInt(item[5]), item[6], item[7], item[8]);
            customers.add(customer);
        }
        for (Customer item : customers) {
            System.out.println(item.toString());
        }

    }

    private String inputName() {
        System.out.println("Nhập tên nhân viên :");
        return RegexData.regexInt(FILE_NAME);
    }

    private String inputPhone() {
        System.out.println("Nhập số diện thoại nhân viên :");
        return RegexData.regexInt(FILE_PHONE);
    }

    private String inputEmail() {
        System.out.println("Nhập EMAIL khách hàng :");
        return RegexData.regexString(FILE_EMAIL);
    }


    @Override
    public void addNew() {
        list = WriteAndReadFile.readFile(FILE_CUSTOMER);
        String name = inputName();
        System.out.println("Nhập tuổi khách hàng :");
        String age = RegexData.regexAge(scanner.nextLine(), FILE_BIRTH);
        System.out.println("1.Nam       2.Nữ");
        boolean gender = false;
        int choice = Integer.parseInt(scanner.nextLine());
        if (choice == 1) {
            gender = true;
        }
        String phoneNumber = inputPhone();
        String email = inputEmail();
        System.out.println("Nhập số CMND khách hàng :");
        int idCard = Integer.parseInt(scanner.nextLine());
        System.out.println("1.Diamond  2.Platinium   3.Gold   4Silver    5.Member");
        String typeCustomer = "";
        String choice1 = scanner.nextLine();
        boolean flag = true;
        while (flag) {
            switch (choice1) {
                case "1":
                    typeCustomer += "Diamond";
                    flag = false;
                    break;
                case "2":
                    typeCustomer += "Platinium";
                    flag = false;
                    break;
                case "3":
                    typeCustomer += "Gold";
                    flag = false;
                    break;
                case "4":
                    typeCustomer += "Silver";
                    flag = false;
                    break;
                case "5":
                    typeCustomer += "Member";
                    flag = false;
                    break;
                default:
                    System.out.println("Nhập lại :");
                    choice1 = scanner.nextLine();
            }
        }
        System.out.println("Nhập địa chỉ khách hàng :");
        String address = scanner.nextLine();
        System.out.println("Nhập mã khách hàng :");
        String id = scanner.nextLine();
        String line = name + "," + age + "," + gender + "," + phoneNumber + "," + email + "," + idCard + ","
                + typeCustomer + "," + address + "," + id;
        WriteAndReadFile.writeFile(FILE_CUSTOMER, line);

    }

    @Override
    public void edit() {
        File file = new File(FILE_CUSTOMER);
        list = WriteAndReadFile.readFile(FILE_CUSTOMER);
        file.delete();
        System.out.println("Nhập id muốn sửa của khách hàng :");
        String id = scanner.nextLine();
        boolean check = false;
        for (Customer item : customers) {
            if (item.getIdCustomer().equals(id)) {
                check = true;
                System.out.println(item);
                String name = inputName();
                item.setName(name);
                System.out.println("Sửa tuổi khách hàng :");
                String age = RegexData.regexAge(scanner.nextLine(), FILE_BIRTH);
                item.setAge(age);
                System.out.println("1.Nam    2.Nữ   ");
                boolean gender = false;
                int choice1 = Integer.parseInt(scanner.nextLine());
                if (choice1 == 1) {
                    gender = true;

                }
                item.setGender(gender);
                String phone = inputPhone();
                item.setPhoneNumber(phone);
                String email = inputEmail();
                item.setEmail(email);
                System.out.println("Sửa CMND của khách hàng :");
                item.setEmail(scanner.nextLine());
                System.out.println("1.Diamond  2.Platinium   3.Gold   4Silver    5.Member");
                String typeCustomer = "";
                String choice = scanner.nextLine();
                boolean flag = true;
                while (flag) {
                    switch (choice) {
                        case "1":
                            typeCustomer += "Diamond";
                            flag = false;
                            break;
                        case "2":
                            typeCustomer += "Platinium";
                            flag = false;
                            break;
                        case "3":
                            typeCustomer += "Gold";
                            flag = false;
                            break;
                        case "4":
                            typeCustomer += "Silver";
                            flag = false;
                            break;
                        case "5":
                            typeCustomer += "Member";
                            flag = false;
                            break;
                        default:
                            System.out.println("Nhập lại :");
                            choice = scanner.nextLine();
                    }

                }
                item.setTypeOfGuest(typeCustomer);
                System.out.println("Sửa địa chỉ khách hàng :");
                item.setAddress(scanner.nextLine());
                display();
            }

            String line = item.getName() + "," + item.getAge() + "," + item.isGender() + "," + item.getPhoneNumber()
                    + "," + item.getEmail() + "," + item.getIdCard() + "," + item.getTypeOfGuest() + "," + item.getAddress()
                    + "," + item.getIdCustomer();
            WriteAndReadFile.writeFile(FILE_CUSTOMER, line);

        }
        if (!check) {
            System.out.println("ID không có trong danh sách");
        }

    }

    @Override
    public void remove() {

    }
}