package lesson_generics.advanced;

public class Demo {
    public static void main(String[] args) {
        String[] arr = {"Apple", "Grape", "Peach", "Melon"};
        MyArrayList<String> list = new MyArrayList<>(arr);
        System.out.println(list);
        list.add("Cherry");
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
    }
}
