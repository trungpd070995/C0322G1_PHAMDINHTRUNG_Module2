package _case_study_resort_furama.controllers;

import _case_study_resort_furama.services.implement.CustomerServiceImpl;
import _case_study_resort_furama.services.implement.EmployeeServiceImpl;
import _case_study_resort_furama.services.implement.FacilityServiceImpl;

import java.util.Scanner;

public class FuramaControllers {

    public static void main(String[] args) {
        displayMainMenu();
    }

    public static void displayMainMenu(){
        Scanner scanner = new Scanner(System.in);
        boolean check = true;
        while (check){
            System.out.println("Menu");
            System.out.println("1.\tEmployee Management");
            System.out.println("2.\tCustomer Management");
            System.out.println("3.\tFacility Management ");
            System.out.println("4.\tPromotion Management");
            System.out.println("5.\tExit");
            System.out.println("Input your Choice :");
            String choice = scanner.nextLine();
            switch (choice){
                case "1":
                    displayEmployeeManagement();
                    break;
                case "2":
                    displayCustomerManagement();
                    break;
                case "3":
                    displayFacilityManagement();
                    break;
                case "4":
                    displayPromotionManagement();
                    break;
                case "5":
                    System.exit(5);
                    break;
                default:
                    System.err.println("Nhập định dạng sai ! Chọn lại");
            }
        }
    }
    public static void displayEmployeeManagement(){
        Scanner scanner = new Scanner(System.in);
        EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
        boolean check = true;
        while (check){
            System.out.println("1\tDisplay list employees");
            System.out.println("2\tAdd new employee");
            System.out.println("3\tEdit employee");
            System.out.println("4\tReturn main menu");
            String choice = scanner.nextLine();
            switch (choice){
                case "1":
                    employeeService.display();
                    break;
                case "2":
                    employeeService.addNew();
                    break;
                case "3":
                    employeeService.edit();
                    break;
                case "4":
                    displayMainMenu();
                    break;
                default:
                    System.err.println("Nhập định dạng sai ! Chọn lại");
            }
        }

    }
    public static void displayCustomerManagement(){
        CustomerServiceImpl customerService = new CustomerServiceImpl();
        Scanner scanner = new Scanner(System.in);
        boolean check = true;
        while (check){
            System.out.println("1\tDisplay list customer");
            System.out.println("2\tAdd new customer");
            System.out.println("3\tEdit customer");
            System.out.println("4\tReturn main menu");
            String choice = scanner.nextLine();
            switch (choice){
                case "1":
                    customerService.display();
                    break;
                case "2":
                    customerService.addNew();
                    break;
                case "3":
                    customerService.edit();
                    break;
                case "4":
                    displayMainMenu();
                    break;
                default:
                    System.err.println("Nhập định dạng sai ! Chọn lại");
            }
        }

    }
    public static void displayFacilityManagement(){
        FacilityServiceImpl facilityService = new FacilityServiceImpl();
        Scanner scanner = new Scanner(System.in);
        boolean check = true;
        while (check){
            System.out.println("1\tDisplay list facility");
            System.out.println("2\tAdd new facility");
            System.out.println("3\tDisplay list FacilityMaintain");
            System.out.println("4\tReturn main menu");
            String choice = scanner.nextLine();
            switch (choice){
                case "1":
                    facilityService.display();
                    break;
                case "2":
                    addNewFacilityManagement();
                    break;
                case "3":
                    facilityService.displayMaintain();
                case "4":
                   return;
                default:
                    System.err.println("Nhập định dạng sai ! Chọn lại");
            }
        }
    }
    public static void addNewFacilityManagement(){
        FacilityServiceImpl facilityService = new FacilityServiceImpl();
        Scanner scanner = new Scanner(System.in);
        boolean check = true;
        while (check){
            System.out.println("1\tAdd New Villa");
            System.out.println("2\tAdd New House");
            System.out.println("3\tAdd New Room");
            System.out.println("4\tBack to menu");
            String choice = scanner.nextLine();
            switch (choice){
                case "1":
                    facilityService.addNewVilla();
                    displayFacilityManagement();
                    break;
                case "2":
                    facilityService.addNewHouse();
                    displayFacilityManagement();
                    break;
                case "3":
                    facilityService.addNewRoom();
                    displayFacilityManagement();
                    break;
                case "4":
                    return;
                default:
                    System.err.println("Nhập định dạng sai ! Chọn lại ");
            }
        }
    }
    public static void displayBookingManagerment(){
        Scanner scanner  = new Scanner(System.in);
        boolean check = true;
        while (check){
            System.out.println("1.\tAdd new booking");
            System.out.println("2.\tDisplay list booking");
            System.out.println("3.\tCreate new constracts");
            System.out.println("4.\tDisplay list contracts");
            System.out.println("5.\tEdit contracts");
            System.out.println("6.\tReturn main menu");

            String choice = scanner.nextLine();
            switch (choice){
                case "1":
                case "2":
                case "3":
                case "4":
                case "5":
                case "6":
                default:
                    System.out.println("Nhập định dạng sai");

            }
        }
    }
    public static void displayPromotionManagement(){
        Scanner scanner = new Scanner(System.in);
        boolean check = true;
        while (check){
            System.out.println("1.\tDisplay list customers use service");
            System.out.println("2.\tDisplay list customers get voucher");
            System.out.println("3.\tReturn main menu");

            String choice = scanner.nextLine();
            switch (choice){
                case "1":
                case "2":
                case "3":
                default:
                    System.out.println("Nhập định dạng sai");
            }
        }
    }
}
