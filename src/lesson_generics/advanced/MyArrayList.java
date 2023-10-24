package lesson_generics.advanced;

import java.util.Arrays;

public class MyArrayList<T> {
    private Object[] elements;
    private int size;

    public MyArrayList() {
        size = 0;
        elements = null;
    }

    public MyArrayList(int size) {
        this.size = size;
        elements = size == 0 ? null : new Object[size];
    }

    public MyArrayList(T[] array) {
        this(array == null ? 0 : array.length);
        if (array == null) {
            elements = new Object[0];
        }
        for (int i = 0; i < size; i++) {
            elements[i] = array[i];
        }
    }

    public T get(int index) {
        return index >= 0 && index < size ? (T) elements[index] : null;
    }

    public void set(int index, T val) {
        if (index < 0 || index >= size) {
            return;
        }
        elements[index] = val;
    }

    public int indexOf(T val) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(val)) {
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(T val) {
        for (int i = size; i >= 0; i--) {
            if (elements[i].equals(val)) {
                return i;
            }
        }
        return -1;
    }

    public int getSize() {
        return size;
    }

    public void clear() {
        elements = null;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean contains(T val) {
        return indexOf(val) != -1;
    }

    public Object[] toArray() {
        Object[] array = new Object[size];
        for (int i = 0; i < size; i++) {
             array[i] = elements[i];
        }
        return array;
    }

    public boolean add(T val) {
        return add(val, size);
    }

    public boolean add(T val, int index) {
        if (index < 0 || index > size) {
            return false;
        }
        Object[] temp = new Object[size + 1];
        if (elements.length > size + 1) {
            temp = new Object[elements.length];
        }
        for (int i = 0; i < size; i++) {
            if (i < index) {
                temp[i] = elements[i];
            } else {
                temp[i + 1] = elements[i];
            }
        }
        temp[index] = val;
        elements = temp;
        size++;
        return true;
    }

    public boolean remove(T value) {
        int index = indexOf(value);
        if (index == -1) {
            return false;
        }
        return remove(index);
    }

    public boolean remove(int index) {
        if (index < 0 || index >= size) {
            return false;
        }
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        size--;
        return true;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder().append("[");
        for (int i = 0; i < size; i++) {
            sb.append(elements[i].toString()).append(i == size - 1 ? "" : ", ");
        }
        return sb.append("]").toString();
    }
}
