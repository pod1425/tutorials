package lesson_exceptions;

import java.util.Arrays;
import java.util.Scanner;

public class Demo {

    public static int readInput() {
        System.out.println("Enter natural number between 1 and 100");
        int input = new Scanner(System.in).nextInt();
        if (input < 1 || input > 100) {
            throw new InputException("Number should be in between 1 and 100");
        }
        return input;
    }

    public static void main(String[] args) {
        int size = readInput();

        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = i * i;
        }
        System.out.println(Arrays.toString(arr));

        /*
        int n = readInput();
        int res = 0;
        for (int i = 0; i < n; i++) {
            res += i;
        }
        System.out.println("Result: " + res);*/
    }
}
