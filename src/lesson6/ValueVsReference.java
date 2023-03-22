package lesson6;

import lesson4.Human;

public class ValueVsReference {

    public static double sqr(double num) {
        num *= num;
        return num;
    }

    public static void changeName(Human human, String name) {
        human.name = name;
    }

    public static void main(String[] args) {
        double number = 16;
        double result = sqr(number);
        System.out.println(result);
        System.out.println(number);

        Human jack = new Human("Jack Sparrow", 189, 84);
        jack.talk();
        changeName(jack, "Jack Gorobets");
        jack.talk();
    }
}
