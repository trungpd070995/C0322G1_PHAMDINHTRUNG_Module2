package _case_study_furama_resort.services.impl;
import _case_study_furama_resort.models.person_class.Employee;
import _case_study_furama_resort.services.ServiceEmployee;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements ServiceEmployee {
    private static final List<Employee> employeeList = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);

    static {
        Employee employee1 = new Employee(
                1, "Trung", "25", "Nam", 21432435, 1256789,
                "dsad", "Nhân viên", 2345, "Đại học");
        Employee employee2 = new Employee(
                2, "Thành", "24", "Nam", 23565466, 1242424,
                "thanh@gmail.com", "Nhân viên", 2345, "Trung cấp");
        Employee employee3 = new Employee(
                3, "Phước", "23", "Nam", 34534534, 1236789,
                "phuoc@gmail.com", "Nhân viên", 2345, "Cao Đẳng");
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
    }

    @Override
    public void display() {
        for (Employee employee : employeeList) {
            System.out.println(employee.toString());
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

        System.out.println("Nhập vị trí: ");
        String location = scanner.nextLine();

        System.out.println("Nhập lương: ");
        int salary = Integer.parseInt(scanner.nextLine());

        System.out.println("Nhập trình độ: ");
        String level = scanner.nextLine();

        Employee employee = new Employee(id, name, dateOfBirth, gender, idCar, phoneNumber, email, location, salary, level);
        employeeList.add(employee);
        System.out.println("Đã thêm mới thành công!");
    }

    @Override
    public void edit() {
        System.out.println("Nhập vào id khách hàng cần chỉnh sửa !");
        int id = Integer.parseInt(scanner.nextLine());
        for (Employee employee : employeeList) {
            if (id == employee.getId()) {
                System.out.println("Nhập id: ");
                employee.setId(Integer.parseInt(scanner.nextLine()));

                System.out.println("Nhập tên: ");
                employee.setName(scanner.nextLine());

                System.out.println("Nhập tuổi: ");
                employee.setDateOfBirth(scanner.nextLine());

                System.out.println("Nhập giới tính: ");
                employee.setGender(scanner.nextLine());

                System.out.println("Nhập chứng minh thư: ");
                employee.setIdCar(Integer.parseInt(scanner.nextLine()));

                System.out.println("Nhập số điện thoại: ");
                employee.setPhoneNumber(Integer.parseInt(scanner.nextLine()));

                System.out.println("Nhập email: ");
                employee.setEmail(scanner.nextLine());

                System.out.println("Nhập vị trí: ");
                employee.setLocation(scanner.nextLine());

                System.out.println("Nhập lương: ");
                employee.setSalary(Integer.parseInt(scanner.nextLine()));

                System.out.println("Nhập trình độ: ");
                employee.setLevel(scanner.nextLine());

                System.out.println("Đã chỉnh sửa thành công!");
            }
        }
    }

    @Override
    public void delete() {

    }
}
