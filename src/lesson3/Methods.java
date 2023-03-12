package lesson3;

public class Methods {

    public static void print(String text) {
        System.out.println(text);
    }

    public static int sum(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static void main(String[] args) {
        int a = 8;
        int b = 10;
        int sum = sum(a, b);
        print(a + " + " + b + " = " + sum);
    }
}
