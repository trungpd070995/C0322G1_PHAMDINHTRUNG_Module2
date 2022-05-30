package _case_study_furama_resort.controllers;
import _case_study_furama_resort.services.impl.CustomerServiceImpl;
import _case_study_furama_resort.services.impl.EmployeeServiceImpl;
import _case_study_furama_resort.services.impl.FacilityServiceImpl;

import java.util.Scanner;

public class FuramaControllers {
    public static void main(String[] args) {
        displayMainMenu();
    }

    public static void displayMainMenu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Menu");
            System.out.println(
                            "1.\tEmployee Management\n" +
                            "2.\tCustomer Management\n" +
                            "3.\tFacility Management \n" +
                            "4.\tBooking Management\n" +
                            "5.\tPromotion Management\n" +
                            "6.\tExit\n");

            System.out.println("Input your choice: ");
            String input = scanner.nextLine();
            switch (input) {
                case "1":
                    employeeManagement();
                    break;
                case "2":
                    custommerManagement();
                    break;
                case "3":
                    facilityManagement();
                    break;
                case "4":
                    bookingManagement();
                    break;
                case "5":
                    promotionManagement();
                    break;
                case "6":
                    System.exit(0);
                    break;
                default:
                    System.err.println("Your choice does not match our options");
            }

        }
    }

    public static void employeeManagement() {
        EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println(
                            "1.\tDisplay list employees \n" +
                            "2.\tAdd new employee \n" +
                            "3.\tEdit employee\n" +
                            "4.\tReturn main menu\n");
            String input = scanner.nextLine();
            switch (input) {
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
                    return;
                default:
                    System.err.println("Your choice does not match our options");
                    break;

            }
        }
    }

    public static void custommerManagement() {
        CustomerServiceImpl customerService = new CustomerServiceImpl();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println(
                            "1.\tDisplay list customers \n" +
                            "2.\tAdd new customer \n" +
                            "3.\tEdit customer\n" +
                            "4.\tReturn main menu\n");
            String input = scanner.nextLine();
            switch (input) {
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
                    return;
                default:
                    System.err.println("Your choice does not match our options");
            }
        }
    }

    public static void facilityManagement() {
        FacilityServiceImpl facilityService = new FacilityServiceImpl();
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        while (true) {
            System.out.println(
                            "1.\tDisplay list facility \n" +
                            "2.\tAdd new facility \n" +
                            "3.\tDisplay list facility maintenance\n" +
                            "4.\tReturn main menu\n");
            switch (input) {
                case "1":
                    facilityService.display();
                    break;
                case "2":
                case "3":
                case "4":
                    return;
                default:
                    System.err.println("Your choice does not match our options");
            }
        }
    }

    public static void bookingManagement() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        while (true) {
            System.out.println(
                            "1.\tAdd new booking \n" +
                            "2.\tDisplay list booking \n" +
                            "3.\tCreate new contracts\n" +
                            "4.\tDisplay list contract\n" +
                            "5.\tEdit contracts\n" +
                            "6.\tReturn main menu\n");
            switch (input) {
                case "1":
                case "2":
                case "3":
                case "4":
                case "5":
                case "6":
                    return;
                default:
                    System.err.println("Your choice does not match our options");
            }
        }
    }

    public static void promotionManagement() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        while (true) {
            System.out.println(
                            "1.\tDisplay list cusomers use service \n" +
                            "2.\tDisplay list customers get voucher\n" +
                            "3.\tReturn main menu\n");
            switch (input) {
                case "1":
                case "2":
                case "3":
                    return;
                default:
                    System.err.println("Your choice does not match our options");
            }
        }
    }
}
