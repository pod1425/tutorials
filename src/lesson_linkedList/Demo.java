package lesson_linkedList;

import java.util.LinkedList;

public class Demo {
    public static void main(String[] args) {
        MyLinkedList<String> list = new MyLinkedList<>();
        list.add("Hello");
        list.add("How are you");
        list.add("123");
        //list.remove("How are you");
        for (String s : list) {
            System.out.println(s);
        }

    }
}
