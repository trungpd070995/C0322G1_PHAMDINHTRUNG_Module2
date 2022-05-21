package _13_searching_algorithms.exercise.find_ascending_string_with_max_length;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AscendingString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào chuỗi: ");
        String str = scanner.nextLine();

        findAscendingString(str);
    }

    public static void findAscendingString(String str) {
        List<Character> characterArrayList = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            characterArrayList.add(str.charAt(i));
        }

        int max;
        int temp;

        max = (int) characterArrayList.get(0);
        System.out.print(characterArrayList.get(0));
        for (int i = 1; i < characterArrayList.size(); i++) {
            temp = (int) characterArrayList.get(i);
            if (max < temp) {
                max = temp;
                System.out.print(characterArrayList.get(i));
            }
        }
    }
}
