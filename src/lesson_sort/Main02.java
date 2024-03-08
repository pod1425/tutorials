package lesson_sort;

public class Main02 {

    private static int binarySearch(int[] arr, int beg, int end, int key) {
        int mid = beg + ((end - beg) / 2);
        if (arr[mid] == key) {
            return mid;
        }
        if (beg == end) {
            return -1;
        }
        return arr[mid] < key
                ? binarySearch(arr, mid + 1, end, key)
                : binarySearch(arr, beg, mid - 1, key);
    }

    public static int binarySearch(int[] arr, int key) {
        return binarySearch(arr, 0, arr.length - 1, key);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 8, 9};
        System.out.println(binarySearch(arr, 9));
    }

}
