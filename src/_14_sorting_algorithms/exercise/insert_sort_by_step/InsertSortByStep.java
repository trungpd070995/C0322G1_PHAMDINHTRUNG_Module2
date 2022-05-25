package _14_sorting_algorithms.exercise.insert_sort_by_step;

import java.util.Arrays;
import java.util.Scanner;

public class InsertSortByStep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter list size: ");
        int size = scanner.nextInt();
        int[] list = new int[size];
        System.out.println("Enter " + list.length + " values: ");
        for (int i = 0; i < list.length; i++) {
            list[i] = scanner.nextInt();
        }
        System.out.println("You input list: ");
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i] + " ");
        }
        System.out.println("\nBegin sort processing...");
        insertionSortByStep(list);
    }

    public static void insertionSortByStep(int[] list){
        int mid , x;
        for (int i = 1; i < list.length ; i++) { //vòng lặp duyệt tất cả các phần tử
            x = list[i]; //chọn 1 phần tử lớn/bé để chèn
            mid = i; //lựa chọn vị trí

            while (mid > 0 && x < list[mid-1]){ //kiểm tra giá trị số liền trước lớn hay bé hơn
                list[mid] = list[mid-1]; //Thực hiện đổi chỗ lên đầu
                mid--;
            }
            list[mid] = x; // chèn phần tử vào vị trí
            System.out.println("List affter the " + i + "'sort ");
            for (int j = 0; j < list.length ; j++) {
                System.out.println(list[j] + " ");
            }
            System.out.println(Arrays.toString(list));
            // Arrays.
        }
    }
}
