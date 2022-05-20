package _12_java_collection_framework.exercise.array_list_linked_list_practicing.array_list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ProductManager {
    static Scanner sc = new Scanner(System.in);
    static List<Product> arrProduct = new ArrayList<>();

    static {
        Product product1 = new Product(1, "car", 1000);
        Product product2 = new Product(2, "phone", 2200);
        Product product3 = new Product(3, "clothes", 1400);
        arrProduct.add(product1);
        arrProduct.add(product2);
        arrProduct.add(product3);
    }

    public void addNewProduct() {
        System.out.println("Input new id");
        int newId = Integer.parseInt(sc.nextLine());
        System.out.println("Input new name");
        String newName = sc.nextLine();
        System.out.println("Input new price");
        double newPrice = Double.parseDouble(sc.nextLine());
        Product newProduct = new Product(newId, newName, newPrice);
        arrProduct.add(newProduct);
        System.out.println("Add new successful");
    }

    public void updateProduct() {
        System.out.println("Input id");
        int id = Integer.parseInt(sc.nextLine());
        boolean check = false;
        for (Product item : arrProduct) {
            if (item.getId() == id) {
                System.out.println("Input update ID: ");
                item.setId(Integer.parseInt(sc.nextLine()));
                System.out.println("Input update name: ");
                item.setName(sc.nextLine());
                System.out.println("Input update price");
                item.setPrice(Double.parseDouble(sc.nextLine()));
                System.out.println("Update successful");
                displayProductList();
                check = true;
                break;
            }
        }
        if (!check) {
            System.out.println("Not found");
        }
    }

    public void displayProductList() {
        for (Product item : arrProduct) {
            System.out.println(item.toString());
        }
    }

    public void findByName() {
        System.out.println("Input name of Product");
        String findName = sc.nextLine().toLowerCase();
        boolean check = false;
        for (int i = 0; i < arrProduct.size(); i++) {
            if (arrProduct.get(i).getName().toLowerCase().contains(findName.toLowerCase())) {
                System.out.println("Founded");
                System.out.println(arrProduct.get(i));
                check = true;
                break;
            }
        }
        if (!check) {
            System.out.println("Not found");
        }
    }

    public void deleteById() {
        System.out.println("Input id of product");
        int id = Integer.parseInt(sc.nextLine());
        boolean check = false;
        for (Product item : arrProduct) {
            if (item.getId() == id) {
                arrProduct.remove(item);
                System.out.println("Delete successful");
                displayProductList();
                check = true;
                break;
            }
        }
        if (!check) {
            System.out.println("Not found");
        }
    }

    public void sortAscending() {
        System.out.println("Sort by Price ascending: ");
        Collections.sort(arrProduct, new AscendingProduct());
        displayProductList();
    }

    public void sortDescending() {
        System.out.println("Sort by Price descending: ");
        Collections.sort(arrProduct, new DescendingProduct());
        displayProductList();
    }
}