package practice.p3;

import java.util.Scanner;

public class P4 {

    public static double askNumber() {
        double num = -1;
        Scanner sc = new Scanner(System.in);
        while (num < 0) {
            System.out.println("Input number (more than zero): ");
            num = sc.nextDouble();
        }
        return num;
    }

    public static void main(String[] args) {
        double number = askNumber();
        System.out.println("Square root is: " + Math.sqrt(number));
    }
}
