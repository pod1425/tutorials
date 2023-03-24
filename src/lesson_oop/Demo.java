package lesson_oop;

public class Demo {
    public static void print(String text) {
        System.out.println(text);
    }
    public static void main(String[] args) {
        //Human jack = new Human("Jack Sparrow", 90, 180);
        //Human vlad = new Human("Vlad Galushko", 81, 178);
        //System.out.println(jack);
        //System.out.println(vlad);
        Item apple1 = new Item(123, "Red apple", 12.5f, 0.200, "Red");
        Item apple2 = new Item(123, "Red apple", 12.5f, 0.200, "Red");

        System.out.println(apple1.hashCode());
        System.out.println(apple2.hashCode());
        System.out.println(apple1.equals(apple2));

    }
}
