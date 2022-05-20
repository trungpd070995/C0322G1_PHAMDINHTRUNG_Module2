package _12_java_collection_framework.exercise.array_list_linked_list_practicing.linked_list;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListProductManager {
    static Scanner sc = new Scanner(System.in);
    static LinkedList<Product> myLinkedList = new LinkedList<>();

    static {
        Product product1 = new Product(1, "orange", 50);
        Product product2 = new Product(2, "banana", 30);
        Product product3 = new Product(3, "apple", 20);
        myLinkedList.add(product1);
        myLinkedList.add(product2);
        myLinkedList.add(product3);
    }

    public void addNewProduct() {
        System.out.println("Input new id");
        int newId = Integer.parseInt(sc.nextLine());
        System.out.println("Input new name");
        String newName = sc.nextLine();
        System.out.println("Input new price");
        double newPrice = Double.parseDouble(sc.nextLine());
        Product newProduct = new Product(newId, newName, newPrice);
        myLinkedList.add(newProduct);
        System.out.println("Add new successful");
    }

    public void updateProduct() {
        System.out.println("Input id");
        int id = Integer.parseInt(sc.nextLine());
        boolean check = true;
        for (Product item : myLinkedList) {
            if (item.getId() == id) {
                System.out.println("Input update ID: ");
                item.setId(Integer.parseInt(sc.nextLine()));
                System.out.println("Input update name: ");
                item.setName(sc.nextLine());
                System.out.println("Input update price");
                item.setPrice(Double.parseDouble(sc.nextLine()));
                check = true;
                break;
            } else {
                check = false;
            }
        }
        if (!check) {
            System.out.println("Not found");
        }
    }

    public void displayProductList() {
        for (Product item : myLinkedList) {
            System.out.println(item.toString());
        }
    }

    public void findByName() {
        System.out.println("Input name of Product");
        String findName = sc.nextLine().toLowerCase();
        boolean check = false;
        for (Product item : myLinkedList) {
            if (item.getName().toLowerCase().equals(findName)) {
                System.out.println("Founded");
                System.out.println(item.toString());
                check = true;
                break;
            } else {
                check = false;
            }
        }
        if (!check) {
            System.out.println("Not found");
        }
    }

    public void deleteById() {
        System.out.println("Input id of product");
        int id = Integer.parseInt(sc.nextLine());
        boolean check = true;
        for (Product item : myLinkedList) {
            if (item.getId() == id) {
                myLinkedList.remove(item);
                System.out.println("Delete successful");
                displayProductList();
                check = true;
                break;
            } else {
                check = false;
            }
        }
        if (!check) {
            System.out.println("Not found");
        }
    }
}