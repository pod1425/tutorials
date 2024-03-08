package lesson_recursion;

public class Main01 {

    public static long fact(long n) {
        if (n <= 1) {
            return 1;
        }
        return fact(n - 1) * n;
    }

    public static void main(String[] args) {
        System.out.println(fact(5));
    }
}
