package test;

import java.util.Scanner;

public class Calculator {

    public static double askNumber() {
        System.out.println("Enter a number>");
        Scanner scanner = new Scanner(System.in);
        double userInput;
        userInput = scanner.nextDouble();
        return userInput;
        //return new Scanner(System.in).nextDouble();
    }

    public static double sum(double num1, double num2) {
        return num1 + num2;
    }
    public static double sub(double num1, double num2) {
        return num1 - num2;
    }
    public static double mul(double num1, double num2) {
        return num1 * num2;
    }
    public static double div(double num1, double num2) {
        return num1 / num2;
    }

    public static void printResults(double num1, double num2, double sumRes,
                                    double subRes, double mulRes, double divRes) {
        System.out.println(num1 + " + " + num2 + " = " + sumRes);
        System.out.println(num1 + " - " + num2 + " = " + subRes);
        System.out.println(num1 + " * " + num2 + " = " + mulRes);
        System.out.println(num1 + " / " + num2 + " = " + divRes);
    }

    public static void main(String[] args) {
        double num1 = askNumber();
        double num2 = askNumber();

        double sumResult = sum(num1, num2);
        double subResult = sub(num1, num2);
        double mulResult = mul(num1, num2);
        double divResult = div(num1, num2);

        printResults(num1, num2, sumResult, subResult, mulResult, divResult);
    }
}
