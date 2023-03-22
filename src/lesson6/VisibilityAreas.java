package lesson6;

public class VisibilityAreas {

    static int num = 7;

    public static void main(String[] args) {

        int num1 = 8;
        if (num1 > 0) {
            double number = 1.5;
        }

        System.out.println(num);
    }

    public static void method() {

        System.out.println(num);
    }
}
