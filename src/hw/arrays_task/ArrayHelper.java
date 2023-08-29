package hw.arrays_task;

import java.util.Scanner;
import java.util.Random;

public class ArrayHelper implements IArrayHelper {
    @Override
    public void print(Object[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(",");
            }
        }
    }

    @Override
    public void printAsList(Object[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println((i + 1) + ". " + array[i]);
        }
    }

    @Override
    public int[] getRandomSequence(int maxElemValue, int amount) {
        int[] randomSequence = new int[amount];
        Random random = new Random();

        for (int i = 0; i < amount; i++) {
            randomSequence[i] = random.nextInt(maxElemValue + 1);
        }
        return randomSequence;
    }

    @Override
    public boolean equals(Object[] array1, Object[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (!array1[i].equals(array2[i])) {
                return false;
            }
        }
        return true;
    }

    @Override
    public double avg(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return (double) sum / array.length;
    }

    @Override
    public int indexOf(Object[] array, Object element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }


    @Override
    public int min(int[] array) {
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > array[index]) {
                index = i;
            }
        }
        return array[index];
    }

    @Override
    public int max(int[] array) {
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < array[index]) {
                index = i;
            }
        }
        return array[index];
    }

    @Override
    public void shuffle(Object[] array) {
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            swap(array[rand.nextInt()], array[i]);
        }
    }

    private void swap(Object l, Object r) {
        Object temp = l;
        l = r;
        r = temp;
    }

    @Override
    public Object[] concat(Object[] array1, Object[] array2) {
        Object[] result = new Object[array1.length + array2.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = i < array1.length ? array1[i] : array2[i - array1.length];
        }
        return result;
    }
}
