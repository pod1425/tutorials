package test;

public class Test {

    public static double calcMedian(int[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        int amount = arr.length;
        return sum / amount;
    }

    public static int findMinimal(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] arr = {1, 8, -6, 34, 12};
        double mid = calcMedian(arr);
        int minimalValue = findMinimal(arr);
        System.out.println("Mediana: " + mid);
        System.out.println("Minimal value: " + minimalValue);
    }
}
