package lesson4;

import java.util.Scanner;

public class ConsoleInput {

    public static int sum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a number> ");
        int num = scanner.nextInt();
        System.out.println("You entered number " + num);
        System.out.println(sum(num, num));
    }
}
