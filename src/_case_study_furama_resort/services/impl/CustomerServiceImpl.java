package _case_study_furama_resort.services.impl;
import _case_study_furama_resort.models.person_class.Customer;
import _case_study_furama_resort.services.ServiceCustomer;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements ServiceCustomer {
    private static final List<Customer> listCustomer = new LinkedList<>();
    private static final Scanner scanner = new Scanner(System.in);

    static {
        Customer customer1 = new Customer(
                1, "Hoàng", "01/02/1999", "Nam", 1234, 12345678,
                "hoang@gmail.com", "vip", "Đà Nẵng");
        Customer customer2 = new Customer(
                2, "Phương", "03/04/1998", "Nam", 4321, 12345679,
                "phuong@gmail.com", "vip", "Huế");
        Customer customer3 = new Customer(
                3, "Tuấn", "02/03/1997", "Nam", 6789, 12345676,
                "tuan@gmail.com", "vip", "Quảng Bình");
        listCustomer.add(customer1);
        listCustomer.add(customer2);
        listCustomer.add(customer3);
    }

    @Override
    public void display() {
        for (Customer customer : listCustomer) {
            System.out.println(customer);
        }
    }

    @Override
    public void addNew() {
        System.out.println("Nhập id: ");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.println("Nhập tên: ");
        String name = scanner.nextLine();

        System.out.println("Nhập tuổi: ");
        String dateOfBirth = scanner.nextLine();

        System.out.println("Nhập giới tính: ");
        String gender = scanner.nextLine();

        System.out.println("Nhập chứng minh thư: ");
        int idCar = Integer.parseInt(scanner.nextLine());

        System.out.println("Nhập số điện thoại: ");
        int phoneNumber = Integer.parseInt(scanner.nextLine());

        System.out.println("Nhập email: ");
        String email = scanner.nextLine();

        System.out.println("Nhập loại khách hàng: ");
        String typeOfGuest = scanner.nextLine();

        System.out.println("Nhập lương: ");
        String address = scanner.nextLine();


        Customer customer = new Customer(id, name, dateOfBirth, gender, idCar, phoneNumber, email, typeOfGuest, address);
        listCustomer.add(customer);
        System.out.println("Đã thêm mới thành công!");
    }

    @Override
    public void delete() {

    }

    @Override
    public void edit() {
        System.out.println("Nhập vào id khách hàng cần chỉnh sửa !");
        int id = Integer.parseInt(scanner.nextLine());
        for (Customer customer : listCustomer) {
            if (id == customer.getId()) {
                System.out.println("Nhập id: ");
                customer.setId(Integer.parseInt(scanner.nextLine()));

                System.out.println("Nhập tên: ");
                customer.setName(scanner.nextLine());

                System.out.println("Nhập tuổi: ");
                customer.setDateOfBirth(scanner.nextLine());

                System.out.println("Nhập giới tính: ");
                customer.setGender(scanner.nextLine());

                System.out.println("Nhập chứng minh thư: ");
                customer.setIdCar(Integer.parseInt(scanner.nextLine()));

                System.out.println("Nhập số điện thoại: ");
                customer.setPhoneNumber(Integer.parseInt(scanner.nextLine()));

                System.out.println("Nhập email: ");
                customer.setEmail(scanner.nextLine());

                System.out.println("Đã chỉnh sửa thành công!");
            }
        }
    }
}
