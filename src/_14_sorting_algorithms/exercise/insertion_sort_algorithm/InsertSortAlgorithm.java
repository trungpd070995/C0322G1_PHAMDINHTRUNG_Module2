package _14_sorting_algorithms.exercise.insertion_sort_algorithm;

public class InsertSortAlgorithm {
    static int[] list = {22, 3, -10, 15, 0, 1, -2, 36, 4, 2};

    public static void insertSortByStep(int[] list){
        int mid, x;
        for (int i = 1; i < list.length ; i++) { //Vòng for lặp duyệt tất cả các phần tử
            x = list[i]; //chọn 1 phần tử lớn/bé nhất để chèn vào
            mid = i; //lựa chọn vị trí để chèn vào

            while (mid > 0 && x < list[mid-1]){ //kiểm tra số phần tử trước nó lớn/bé hơn phần tử được chèn vào hay không
                list[mid] = list[mid-1]; // đổi vị trí lên đầu
                mid--;
            }
            list[mid] = x; //chèn phần tử vào vị trí và sắp xếp lại
        }
    }

    public static void main(String[] args) {
        insertSortByStep(list);
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i] + " ");
        }
    }
}
