package _10_dsa_list.exercise.array_list;
import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        elements = new Object[capacity];
    }

    public void add(E o) {
        size += 1;
        elements[size - 1] = o;
    }

    public E remove(int i) {
        if (i >= 0 && i < size) {
            for (; i < size; i++) {
                elements[i] = elements[i + 1];
            }
            size -= 1;
        }
        return (E) elements;
    }

    public int getSize() {
        return size;
    }

    public MyList<E> clone() {
        return this;
    }

    public boolean contains(E o) {
        for (Object x : elements) {
            if (o.equals(x)) {
                return true;
            }
        }
        return false;
    }

    public int indexOf(E o) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(o)) {
                return i;
            }
        }
        return -1;
    }

    private void ensureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public boolean add(int index, E e) {
        if (index >= 0 && index <= size) {
            size += 1;
            ensureCapa();
            for (int i = size - 2; i >= index; i--) {
                elements[i + 1] = elements[i];
            }
            elements[index] = e;
            return true;
        }
        return false;
    }

    public void ensureCapacity(int minCapacity) {
        elements = Arrays.copyOf(elements, minCapacity);
    }

    public E get(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
        }
        return (E) elements[i];
    }

    public void clear() {
        elements = new Object[DEFAULT_CAPACITY];
        size = 0;
    }
}