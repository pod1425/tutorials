package lesson_arrays;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        int[] arr = {-2, 8, 7, 4, 6};
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
           arr[i] *= 2;
        }
        System.out.println(Arrays.toString(arr));
    }
}
