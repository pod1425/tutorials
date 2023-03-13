package lesson4;

import java.util.Scanner;

public class ConsoleInput {

    public static int sum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to calculator! Enter two numbers >");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("Sum of two numbers = " + sum(num1, num2));
    }
}
