package lesson_encapsulation;

public class Demo {
    public static void main(String[] args) {
        Human jack = new Human("Jack Sparrow", -1, 90);
        //jack.setHeight(-1);
        System.out.println(jack.getHeight());
    }
}
