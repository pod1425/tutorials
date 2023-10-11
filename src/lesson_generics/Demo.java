package lesson_generics;

public class Demo {

    public static void main(String[] args) {
        Pair<String, String> pair = new Pair<>("Hello", "String");

        String str = pair.getFirst();

        System.out.println(str);
    }
}
