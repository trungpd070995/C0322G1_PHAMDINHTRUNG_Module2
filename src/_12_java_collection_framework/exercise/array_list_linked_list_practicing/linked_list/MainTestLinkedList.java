package _12_java_collection_framework.exercise.array_list_linked_list_practicing.linked_list;

import java.util.Scanner;

public class MainTestLinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedListProductManager myLinkedList = new LinkedListProductManager();
        boolean check = true;
        while (check) {
            System.out.println("1. Display product list");
            System.out.println("2. Add new product");
            System.out.println("3. Update product");
            System.out.println("4. Delete product");
            System.out.println("5. Find product");
            System.out.println("6. Sort product");
            System.out.println("0. Exit");
            System.out.print("Choose option: ");
            switch (Integer.parseInt(sc.nextLine())) {
                case 1:
                    myLinkedList.displayProductList();
                    break;
                case 2:
                    myLinkedList.addNewProduct();
                    break;
                case 3:
                    myLinkedList.updateProduct();
                    break;
                case 4:
                    myLinkedList.deleteById();
                    break;
                case 5:
                    myLinkedList.findByName();
                    break;
                case 6:
                    break;
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