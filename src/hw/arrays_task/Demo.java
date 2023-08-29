package hw.arrays_task;

import java.util.Arrays;
import java.util.Scanner;

public class Demo {

    public static void print(Object[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        HomeworkPractice hp = new HomeworkPractice();
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 3, 5, 7, 9};
        int[] arr = hp.intersect(arr1, arr2);

        System.out.println(Arrays.toString(arr));
        /*Object[] arr = new Object[2];
        arr[0] = "Hello";
        arr[1] = "There is a hint here";
        Object[] arr1 = new Object[3];
        arr1[0] = "You can pass any type of array into this method";
        arr1[1] = "Its because the parameter type is Object[]";
        arr1[2] = "And in arrays of element type Object you can store anything!";
        ArrayHelper ah = new ArrayHelper();
        ah.print(ah.concat(arr, arr1));*/
    }
}
