package _10_dsa_list.exercise.array_list;

public class TestMyArrayList {
    public static void main(String[] args) {
        MyArrayList<Integer> myArrayList = new MyArrayList<>();
        System.out.println("Mảng ban đầu là: ");
        myArrayList.add(1);
        myArrayList.add(3);
        myArrayList.add(6);
        myArrayList.add(9);
        System.out.println(myArrayList);

        System.out.println("Thêm phần tử vào mảng: ");
        myArrayList.add(4, 8);
        System.out.println(myArrayList);

        System.out.println(" Xóa phần tử ở vị trí thứ index: ");
        myArrayList.remove(5);
        System.out.println(myArrayList.toString());

        System.out.println("Tìm vị trí của phần tử trong mảng: ");
        System.out.println(myArrayList.indexOf(1));


        System.out.println(" Tìm kiếm phần tử trong mảng: ");
        System.out.println(myArrayList.contains(3));


        System.out.println(" Sau khi xóa mảng : ");
        myArrayList.clear();
        System.out.println(myArrayList.toString());

    }
}