package lesson_if_else;

import java.util.Scanner;

public class Conditions {

    public static String checkNumberSign(int a) {
        if (a > 0) {
            return "positive";
        }
        if (a < 0) {
            return "negative";
        }
        return "zero";
    }

    public static void checkParity(int num) {
        if (num % 2 == 0) {
            System.out.println("even");
            return;
        }
        System.out.println("odd");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number > ");
        int a = sc.nextInt();
        System.out.print("Number is ");
        checkParity(a);
    }
}
