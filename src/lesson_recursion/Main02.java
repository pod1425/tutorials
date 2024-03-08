package lesson_recursion;

public class Main02 {

    /*
    знайти число фібоначчі по номеру
     */

    /*
    0 1 1 2 3 5 8 13
     */

    public static int fibonacciNumber(int n) {
        if (n <= 2) {
            return n - 1;
        }
        return fibonacciNumber(n - 1) + fibonacciNumber(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(fibonacciNumber(8));
    }
}
