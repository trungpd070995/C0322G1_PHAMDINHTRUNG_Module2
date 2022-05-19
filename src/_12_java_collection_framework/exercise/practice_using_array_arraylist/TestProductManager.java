package _12_java_collection_framework.exercise.practice_using_array_arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class TestProductManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ProductManager productManager = new ProductManager();
        ArrayList<Product> products = ProductManager.productArrayList;
        int choice;
        do {
            System.out.println("===PRODUCT MANAGER===");
            System.out.println("1. Thêm sản phẩm");
            System.out.println("2. Chỉnh sửa sản phẩm");
            System.out.println("3. Xoá sản phẩm");
            System.out.println("4. Tìm kiếm sản phẩm");
            System.out.println("5. Sắp xếp sản phẩm");

            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:

                case 2:
                    productManager.addNewProduct();
                case 3:

                case 4:

                case 5:
            }
        } while (choice != 0);
    }
}
