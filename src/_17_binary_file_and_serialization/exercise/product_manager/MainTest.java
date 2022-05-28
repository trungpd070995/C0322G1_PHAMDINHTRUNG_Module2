package _17_binary_file_and_serialization.exercise.product_manager;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainTest {
    public static void main(String[] args) {
        String path = "src\\_17_binary_file_and_serialization\\exercise\\product_manager\\sanpham.txt";
        List<Product> listProduct = new ArrayList<>();
        listProduct.add(new Product(1, "Samsung", "Samsung", 20000000, "Màu đỏ"));
        listProduct.add(new Product(2, "Galaxy", "Samsung", 30000000, "Màu xanh"));
        listProduct.add(new Product(3, "Iphone", "Iphone", 35000000, "Màu trắng"));
        listProduct.add(new Product(4, "Oppo", "Oppo", 25000000, "Màu hồng"));
        listProduct.add(new Product(5, "Siaomi", "Siaomi", 15000000, "Màu đen"));
        ProductManager.writeToFile(path, listProduct);

        while (true) {
            System.out.println("QUẢN LÝ SẢN PHẨM:");
            System.out.println("1. Thêm sản phẩm");
            System.out.println("2. Hiển thị sản phẩm");
            System.out.println("3. Tìm kiếm sản phẩm");
            System.out.println("4. Thoát chương trình");

            Scanner input = new Scanner(System.in);
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    ProductManager.add(path);
                    break;
                case 2:
                    ProductManager.display(path);
                    break;
                case 3:
                    ProductManager.search(path);
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Lựa chọn này không có trong danh sách. Vui lòng chọn lại!!!");
            }
        }
    }
}
