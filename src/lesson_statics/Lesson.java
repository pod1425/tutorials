package lesson_statics;

public class Lesson {

    public static int num;

    public int sum(int a, int b) {
        return a + b;
    }

    public static void printMessage() {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        //Lesson l1 = new Lesson();
        //Lesson l2 = new Lesson();
        Lesson.num = 5;
        //System.out.println(Lesson.num);
        System.out.println(Math.PI);
    }
}
