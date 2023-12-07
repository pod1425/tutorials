package lesson_linkedList;

import java.util.Iterator;

public class MyLinkedList<T> implements Iterable<T>{

    private Node<T> first;
    private Node<T> last;

    public MyLinkedList() {
        first = null;
        last = null;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public int count() {
        if (first == null || last == null) {
            return 0;
        }
        if (first == last) {
            return 1;
        }
        int count = 0;
        Node<T> i = first;
        while (i.hasNext()) {
            i = i.next;
            count++;
        }
        return count + 1;
    }

    public void add(T val) {
        if (first == null) {
            first = new Node<>(val);
            last = first;
            return;
        }
        Node<T> newLast = new Node<>(val);
        last.next = newLast;
        last = newLast;
    }

    public void addFirst(T val) {
        Node<T> newFirst = new Node<>(val);
        newFirst.next = first;
        first = newFirst;
    }

    public boolean removeFirst() {
        if (first == null) {
            return false;
        }
        first = first.next;
        return true;
    }

    public boolean removeLast() {
        if (first == null) {
            return false;
        }
        if (first == last) {
            first = null;
            last = null;
            return true;
        }
        Node<T> it = first;
        while (it.next.hasNext()) {
            it = it.next;
        }
        it.next = null;
        last = it;
        return true;
    }

    public void clear() {
        first = null;
        last = null;
    }

    public T getFirst() {
        if (first == null) {
            return null;
        }
        return first.val;
    }

    public T getLast() {
        if (last == null) {
            return null;
        }
        return last.val;
    }

    public void setFirst(T val) {
        if (first == null) {
            return;
        }
        first.val = val;
    }

    public void setLast(T val) {
        if (last == null) {
            return;
        }
        last.val = val;
    }

    public T get(int index) {
        if (isEmpty()) {
            return null;
        }
        if (index < 0) {
            throw new IndexOutOfBoundsException("Index cant be negative");
        }
        if (index == 0) {
            return first.val;
        }
        Node<T> toReturn = first;
        for (int i = 1; i <= index; i++) {
            toReturn = toReturn.next;
        }
        return toReturn.val;
    }

    public void set(T val, int index) {
        if (isEmpty()) {
            return;
        }
        if (index < 0) {
            throw new IndexOutOfBoundsException("Index cant be negative");
        }
        Node<T> toUpdate = first;
        for (int i = 1; i <= index; i++) {
            toUpdate = toUpdate.next;
        }
        toUpdate.val = val;
    }

    public boolean remove(T val) {
        if (first.val.equals(val)) {
            return removeFirst();
        }
        if (last.val.equals(val)) {
            return removeLast();
        }
        Node<T> i = first;
        while (i.hasNext()) {
            if (i.next.val.equals(val)) {
                i.next = i.next.next;
                return true;
            }
            i = i.next;
        }
        return false;
    }

    public boolean contains(T val) {
        Node<T> i = first;
        while (i.hasNext()) {
            if (i.next.val.equals(val)) {
                return true;
            }
            i = i.next;
        }
        return false;
    }

    @Override
    public Iterator<T> iterator() {
        return new MyIterator<>(first);
    }

    private static class MyIterator<T> implements Iterator<T> {

        private Node<T> pointer;

        MyIterator(Node<T> first) {
            this.pointer = first;
        }

        @Override
        public boolean hasNext() {
            return pointer != null;
        }

        @Override
        public T next() {
            T toReturn;
            if (pointer == null) {
                toReturn = null;
            } else {
                toReturn = pointer.val;
                pointer = pointer.next;
            }
            return toReturn;
        }
    }

    private static class Node<T> {
        private T val;
        private Node<T> next;

        public Node(T val) {
            this.val = val;
            next = null;
        }

        public Node(T val, Node<T> next) {
            this.val = val;
            this.next = next;
        }

        public boolean hasNext() {
            return next != null;
        }
    }
}
