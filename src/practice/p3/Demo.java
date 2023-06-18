package practice.p3;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Demo {
    private static int max(int a, int b) {
        return a < b ? b : a;
    }

    private static boolean isPositive(double num) {
        return num > 0;
    }

    private static boolean isEven(int n) {
        return n % 2 == 0;
    }

    private static void printProductSign(int a, int b, int c) {
        System.out.println("Product is " + (a * b * c >= 0 ? "positive" : "negative"));
    }

    private static int[] getFibonacciSequence(int amount) {
        int[] fibonacciSequence = new int[amount];
        int a = 1;
        int b = 1;
        fibonacciSequence[0] = a;
        fibonacciSequence[1] = b;
        for (int i = 2; i < amount; i++) {
            if (isEven(i)) {
                b = a + b;
            } else {
                a = a + b;
            }
            fibonacciSequence[i] = isEven(i) ? b : a;
        }
        return fibonacciSequence;
    }

    private static int sum(int[] arr) {
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            result += arr[i];
        }
        return result;
    }

    private static int max(int[] arr) {
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < arr[index]) {
                index = i;
            }
        }
        return index;
    }

    private static int find(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        final int amount = 15;
        int[] fibonacciSequence = getFibonacciSequence(amount);
        System.out.println(Arrays.toString(fibonacciSequence));
        System.out.println(sum(fibonacciSequence));

        int[] arr = { 4, 8, 6, 69, 44, 8, 93, 7, 55 };
        int index = find(arr, 8489489);
        System.out.println(arr[index] + ", index of it is " + index);
    }


}
