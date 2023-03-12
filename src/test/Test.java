package test;

public class Test {
    public static void main(String[] args) {
        int[] arr = {2, 8, 6, -4, 0, 7, 5};

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}
