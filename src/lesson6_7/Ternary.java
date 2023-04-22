package lesson6_7;

import java.util.Scanner;

public class Ternary {
    public static void main(String[] args) {
        int number = new Scanner(System.in).nextInt();
        System.out.println("Number is " + (
                number < 0 ? "less than zero!"
                        : (number != 0 ? "more than zero!" : "zero")));
    }
}
