package _10_dsa_list.exercise.linked_list;

public class MyLinkedList<E> {
    private Node head;
    private int numNodes = 0;

    private static class Node {
        private Node next;
        private final Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }

    public MyLinkedList() {
    }

    public void addFirst(E element){
        Node temp = head;
        head = new Node(element);
        head.next = temp;
        numNodes++;
    }

    public void addLast(E element){
        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = new Node(element);
        numNodes++;
    }

    public void add(int index, E element){
        Node temp = head;
        Node holder;
        for (int i = 0; i < index - 1 && temp.next != null ; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(element);
        temp.next.next = holder;
        numNodes++;
    }

    public Object get(int index){
        Node temp = head;
        for (int i = 0; i < index ; i++) {
            temp = temp.next;
        }
        return temp.data;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < numNodes - 1 ; i++) {
            str.append(get(i)).append(", ");
        }
        str.append(get(numNodes - 1));
        return str.toString();
    }

    public void remove(int index){
        if (index < 0 || index > numNodes){
            throw new IllegalArgumentException("Error index: " + index);
        }
        Node temp = head;

        Object data;

        if (index == 0){
            data = temp.data;
            head = head.next;
            numNodes--;
        }else {
            for (int i = 0; i < index - 1 && temp.next != null ; i++) {
                temp = temp.next;
            }
            assert temp.next != null;
            data = temp.next.data;
            temp.next = temp.next.next;
            numNodes--;
        }
    }

    public void remove(E element){
        if (head.data.equals(element)){
            remove(0);
        }else {
            Node temp = head;
            while (temp.next != null){
                if (temp.next.data.equals(element)){
                    temp.next = temp.next.next;
                    numNodes--;
                    return;
                }
                temp = temp.next;
            }
        }
    }
}