package _12_java_collection_framework.exercise.practice_using_array_arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductManager {
    Scanner sc = new Scanner(System.in);
    static ArrayList<Product> productArrayList = new ArrayList<>();

    static {
        productArrayList.add(new Product(1, "REDBULL", 15000, 6));
        productArrayList.add(new Product(2, "COCA", 12000, 5));
        productArrayList.add(new Product(3, "DR.THANH", 9000, 3));
        productArrayList.add(new Product(4, "NUMBER-ONE", 10000, 4));
        productArrayList.add(new Product(5, "MIRRINDA", 13000, 2));
    }

    public void displayProduct(){
        for (Product item: productArrayList) {
            System.out.println(productArrayList);
        }
    }

    public void addNewProduct(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập id: ");
        int idProduct = Integer.parseInt(sc.nextLine());

        System.out.println("Nhập tên sản phẩm: ");
        String nameProduct = sc.nextLine();

        System.out.println("Nhập giá sản phẩm: ");
        double pratice = Double.parseDouble(sc.nextLine());

        System.out.println("Nhập số lượng sản phẩm: ");
        int quantity = Integer.parseInt(sc.nextLine());

        Product product = new Product(idProduct, nameProduct, pratice, quantity);
        productArrayList.add(product);

    }

    public void update(){

    }

}

