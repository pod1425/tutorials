package lesson5;

import java.util.Scanner;

public class Demo {

    public static boolean isPositive(int number) {
        return number > 0;
    }

    public static void evaluateNumber() {
        System.out.println("Input a number> ");
        int num = new Scanner(System.in).nextInt();
        boolean numIsZero = num == 0;
        if (isPositive(num)) {
            System.out.println("Number is positive");
        } else if (numIsZero) {
            System.out.println("Number is zero");
        } else {
            System.out.println("Number is negative");
        }
    }

    public static void demo1() {
        System.out.println("Input a number in range 0-10> ");
        int num = new Scanner(System.in).nextInt();
        int min = 0;
        int max = 10;

        if (num > min && num < max) {
            System.out.println("You entered number correctly");
        } else {
            System.out.println("You entered number incorrectly! Better luck next time");
        }
    }

    public static void main(String[] args) {
        System.out.println("Input negative number> ");
        int num = new Scanner(System.in).nextInt();
        if (!isPositive(num)) {
            System.out.println("Thats correct!");
        } else {
            System.out.println("You entered number incorrectly! Better luck next time");
        }
        //demo1();
        //evaluateNumber();
        /*
        System.out.println("Input 1 or 2> ");
        int num = new Scanner(System.in).nextInt();
        if (num == 1 || num == 2) {
            System.out.println("Thats correct!");
        } else {
            System.out.println("You entered number incorrectly! Better luck next time");
        }

         */
    }
}
