package _10_dsa_list.exercise.linked_list;

public class TestMyLinkedList {
    public static void main(String[] args) {
        MyLinkedList<Integer> linkedList = new MyLinkedList<>();
        linkedList.addFirst(11);
        linkedList.addFirst(12);
        linkedList.addFirst(13);
        System.out.println(linkedList);
        linkedList.addLast(14);
        linkedList.addLast(16);
        System.out.println(linkedList);
        linkedList.add(2,20);
        System.out.println(linkedList);
        linkedList.remove(2);
        linkedList.remove(3);
        linkedList.remove((Integer)11);
        System.out.println(linkedList);
    }
}
