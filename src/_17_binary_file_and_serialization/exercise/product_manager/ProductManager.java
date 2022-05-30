package _17_binary_file_and_serialization.exercise.product_manager;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductManager {
    private static final Scanner input = new Scanner(System.in);

    public static void writeToFile(String path, List<Product> listProduct) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(listProduct);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void add(String path) {
        System.out.println("Nhập mã của sản phẩm: ");
        int id = Integer.parseInt(input.nextLine());
        System.out.println("Nhập tên sản phẩm: ");
        String name = input.nextLine();
        System.out.println("Nhập hãng sản xuất: ");
        String manufacturer = input.nextLine();
        System.out.println("Nhập giá sản phẩm:");
        int price = Integer.parseInt(input.nextLine());
        System.out.println("Miêu tả sản phẩm: ");
        String discription = input.nextLine();
        Product product1 = new Product(id, name, manufacturer, price, discription);

        List<Product> productList = readDataFromFile(path);
        productList.add(product1);
        writeToFile(path, productList);
        display(path);
    }

    public static List<Product> readDataFromFile(String path) {
        List<Product> listProduct = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            listProduct = (List<Product>) ois.readObject();
            fis.close();
            ois.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return listProduct;
    }

    public static void display(String path) {
        List<Product> productList =readDataFromFile(path);
        for (Product product : productList) {
            System.out.println(product);
        }
    }

    static void search(String path) {
        System.out.println("Nhập tên sản phẩm bạn muốn tìm kiếm");
        String name = input.next();
        List<Product> productList = readDataFromFile(path);
        for (Product product : productList) {
            if (product.getName().contains(name)) {
                System.out.println("Thông tin sản phẩn cần tìm: " + product);
            }
        }
        System.out.println("Sản phẩm không có trong danh sách");
    }
}
