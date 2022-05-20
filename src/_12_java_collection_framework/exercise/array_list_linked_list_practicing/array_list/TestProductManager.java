package _12_java_collection_framework.exercise.array_list_linked_list_practicing.array_list;

import java.util.Scanner;

public class TestProductManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProductManager productManagerMain = new ProductManager();
        boolean check = true;
        while (check) {
            System.out.println("1. Display product list");
            System.out.println("2. Add new product");
            System.out.println("3. Update product");
            System.out.println("4. Delete product");
            System.out.println("5. Find product");
            System.out.println("6. Sort ascending product");
            System.out.println("7. Sort descending product");
            System.out.println("0. Exit");
            System.out.print("Choose option: ");
            switch (Integer.parseInt(sc.nextLine())) {
                case 1:
                    productManagerMain.displayProductList();
                    break;
                case 2:
                    productManagerMain.addNewProduct();
                    break;
                case 3:
                    productManagerMain.updateProduct();
                    break;
                case 4:
                    productManagerMain.deleteById();
                    break;
                case 5:
                    productManagerMain.findByName();
                    break;
                case 6:
                    productManagerMain.sortAscending();
                    break;
                case 7:
                    productManagerMain.sortDescending();
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Retry");
                    break;
            }
        }
    }
}