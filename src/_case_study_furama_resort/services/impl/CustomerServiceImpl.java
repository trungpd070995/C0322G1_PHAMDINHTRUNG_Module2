package _case_study_furama_resort.services.impl;
import _case_study_furama_resort.models.person_class.Customer;
import _case_study_furama_resort.services.ServiceCustomer;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements ServiceCustomer {
    private static List<Customer> listCustomer = new LinkedList<>();
    private static Scanner scanner = new Scanner(System.in);

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

            }
        }
    }
}
