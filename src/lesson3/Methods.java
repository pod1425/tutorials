package lesson3;

import java.util.Scanner;

public class Methods {

    public static void print(String text) {
        System.out.println(text);
    }

    /**
     * Adds two numbers!
     * @param a first number
     * @param b second number
     * @return sum of those two numbers
     */
    public static int sum(int a, int b) {
        return a + b;
    }

    public static int askNumber(String message) {
        print(message);
        return new Scanner(System.in).nextInt();
    }

    public static void run() {
        String greeting = "hello! I can add two numbers!";
        print(greeting);
        int a = askNumber("Input first number>");
        int b = askNumber("Input second number>");
        print("Result:");
        System.out.println(sum(a, b));
    }

    public static void main(String[] args) {
        run();
    }
}
