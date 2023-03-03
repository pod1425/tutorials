package lesson3;

import java.util.Scanner;

public class Methods {

    public static void print(String text)
    {
        System.out.println(text);
    }

    public static double perimeter(double a, double b) {
        return 2 * (a + b);
    }

    public static double askNumber(String message){
        Scanner scanner = new Scanner(System.in);
        print(message);
        return scanner.nextDouble();
    }

    public static void printResult(double result) {
        print("Result is: " + result);
    }

    public static void main(String[] args) {
        print("Hello! Lets calculate the perimeter!");

        double a = askNumber("Enter side a: ");
        double b = askNumber("Enter side b: ");
        printResult(perimeter(a, b));
    }
}
