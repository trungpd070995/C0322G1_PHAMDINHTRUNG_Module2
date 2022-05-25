package _15_debug_exception_handling.pratice.try_catch;

import java.util.Random;

public class ArrayExample {
    public Integer[] createRandom(){
        Random random = new Random();
        Integer[] arr = new Integer[100];
        System.out.println("Danh sách phần tử của mảng: ");
        for (int i = 0; i < 100; i++) {
            arr[i] = random.nextInt(100);
            System.out.print(arr[i] + " ");
        }
        return arr;
    }
}
