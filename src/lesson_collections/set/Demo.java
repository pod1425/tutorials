package lesson_collections.set;


import java.util.*;


public class Demo {

    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Hello");
        set.add("My friend");
        set.add("How");

        Object[] arr = set.toArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].hashCode() + ": " + arr[i]);
        }

    }
}
