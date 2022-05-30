package _case_study_furama_resort.services.impl;
import _case_study_furama_resort.models.person_class.Employee;
import _case_study_furama_resort.services.ServiceEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class EmployeeServiceImpl implements ServiceEmployee {
private static List<Employee> employeeList = new ArrayList<>();
private static Scanner scanner = new Scanner(System.in);
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

        Employee employee = new Employee(id,name,dateOfBirth,gender,idCar,phoneNumber,email,location,salary,level);
        employeeList.add(employee);
    }

    @Override
    public void delete() {

    }

    @Override
    public void edit() {

    }
}
