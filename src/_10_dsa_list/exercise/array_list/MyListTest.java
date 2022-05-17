package _10_dsa_list.exercise.array_list;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> myList = new MyList<Integer>();
        myList.add(0, 1);
        myList.add(1, 2);
        myList.add(2, 3);
        myList.add(3, 4);
        myList.add(4, 5);
        myList.add(5, 6);
        myList.add(6, 7);
        myList.add(7, 8);
        System.out.println("Size of mylist: " + myList.getSize());
        System.out.println("element of myList: ");
        for (int i = 0; i < myList.getSize(); i++) {
            System.out.println("element " + i + ": " + myList.get(i));
        }
        myList.remove(1);
        myList.remove(2);
        myList.remove(4);

        //sau khi thực hiện xóa thì đã xóa phần tử 2,4,7
        System.out.println("Size of mylist: " + myList.getSize());
        System.out.println("element of myList after remove: ");
        for (int i = 0; i < myList.getSize(); i++) {
            System.out.println("element " + i + ": " + myList.get(i));
        }

        System.out.println(myList.get(2));
        System.out.println(myList.contains(3));
        System.out.println(myList.indexOf(7));

        MyList<Integer> clone = myList.clone();
        System.out.println("element of clone: ");
        for (int i = 0; i < clone.getSize(); i++) {
            System.out.println("element " + i + ": " + clone.get(i));
        }
        System.out.println(clone.get(4));
    }
}