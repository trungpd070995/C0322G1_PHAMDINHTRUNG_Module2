package _case_study_furama_resort.services.impl;

import _case_study_furama_resort.models.person_class.Customer;
import _case_study_furama_resort.services.ServiceCustomer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerImpl implements ServiceCustomer {
    private static final List<Customer> listCustomer = new LinkedList<>();
    private static Scanner scanner = new Scanner(System.in);

    @Override
    public void display() {
        List<String[]> customerList = new ArrayList<>();

        for (String[] item: customerList) {
            Customer customer = new Customer(Integer.parseInt(item[0]),item[1],item[2],
                    item[3],Integer.parseInt(item[4]),Integer.parseInt(item[5]),item[6],item[7],item[8]);
        }

    }

    @Override
    public void addNew() {

    }

    @Override
    public void delete() {

    }

    @Override
    public void edit() {

    }

}
