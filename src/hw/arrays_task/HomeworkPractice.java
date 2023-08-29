package hw.arrays_task;


import java.util.Arrays;

public class HomeworkPractice {
    public void reverse(int[] array) {
        int[] result = new int[array.length];
        for (int i = 0, j = array.length - 1; i < array.length; i++, j--) {
            result[j] = array[i];
        }
        for (int i = 0; i < result.length; i++) {
            array[i] = result[i];
        }
    }

    boolean contains(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return true;
            }
        }
        return false;
    }

    private int[] arrayIntersect(int[] b, int[] s) {
        int[] temp = new int[s.length];
        int j = 0;
        for (int i = 0; i < b.length; i++) {
            if (contains(s, b[i]) && !contains(temp, b[i])) {
                temp[j] = b[i];
                j++;
            }
        }
        int[] res = new int[j];
        for (int i = 0; i < j; i++) {
            res[i] = temp[i];
        }
        return res;
    }

    public int[] intersect(int[] array1, int[] array2) {
        int[] intersection = new int[Math.min(array1.length, array2.length)];

        return array1.length > array2.length ?
                arrayIntersect(array1, array2) :
                arrayIntersect(array2, array1);
    }

    public int count(int[] array, int value) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (value == array[i]) {
                count++;
            }
        }
        return count;
    }

    public int median(int[] array) {
        int[] temp = new int[array.length];
        for (int i = 0; i < temp.length; i++) {
            array[i] = temp[i];
        }
        Arrays.sort(temp);
        if (temp.length % 2 == 0) {
            int i = temp.length / 2;
            return (temp[i] + temp[i + 1]) / 2;
        } else {
            return temp[temp.length / 2];
        }
    }
}

