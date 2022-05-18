package _10_dsa_list.exercise.array_list;
import java.util.Arrays;

public class MyArrayList<E> {
    /**Số lượng phần tử có trong MyArrayList*/
    private int size = 0;

    /**lưu số phần tử đối đa trong danh sách mặc định là 10*/
    private static final int DEFAULT_CAPACITY = 10;

    /**Mảng chứa các phần tử*/
    public Object[] elements;

    public MyArrayList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    private void ensureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    /**Phương thức Constructor với sức chứa được truyền vào*/
    public MyArrayList(int capacity) {
        if (capacity >= 0) {
            elements = new Object[capacity];
        } else {
            throw new IllegalArgumentException("capacity: " + capacity);
        }
    }

    /**Phương thức trả về số lượng phần tử*/
    public int size() {
        return this.size;
    }

    /**Phương thức Clear ArrayList*/
    public void clear() {
        size = 0;
        for (int i = 0; i < elements.length; i++) {
            elements[i] = null;
        }
    }

    public boolean contains(E element) {
        if (indexOf(element) != -1) {
            return true;
        }
        return false;
    }

    /**Phương thức thêm 1 phần tử vào MyArrayList*/
    public boolean add(E element) {
        if (elements.length == size) {
            this.ensureCapacity(6);
        }
        elements[size] = element;
        size++;
        return true;
    }


    public void add(int index, E element) {
        if (index > elements.length) {
            throw new IllegalArgumentException("Index: " + index);
        } else if (elements.length == size) {
            this.ensureCapacity(6);
        }
        if (elements[index] == null) {
            elements[index] = index;
        } else {
            for (int i = size + 1; i >= index; i--) {
                elements[i] = elements[i - 1];
            }
            elements[index] = element;
        }
        size++;
    }

    /**Phương thức tăng kích thước của MyArrayList*/
    public void ensureCapacity(int minCapacity) {
        if (minCapacity >= 0) {
            int newSize = this.elements.length + minCapacity;
            elements = Arrays.copyOf(elements, newSize);
        } else {
            throw new IllegalArgumentException("minCapacity: " + minCapacity);
        }
    }

    /**phương thức được sử dụng để xóa một phần tử khỏi mảng arraylist.*/
    public E remove(int index) {
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        elements[size - 1] = null;
        size--;
        return (E) elements;
    }


    public E get(int index) {
        return (E) elements[index];
    }

    /**Phương thức indexOf() trả về chỉ số của giá*/
    public int indexOf(E element) {
        for (int i = 0; i < size; i++) {
            if (element == elements[i]) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("[");

        for (int i = 0; i < size; i++) {
            if (elements[i] == null)
                break;
            result.append(elements[i]);
            if (i < size - 1)
                result.append(", ");
        }

        return result.toString() + "]";
    }

}