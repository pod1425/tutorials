package practice.midterm;

public class Task12 {

    public static boolean balancedNumber(int number) {
        int sumEven = 0;
        int sumOdd = 0;
        while (number > 0) {
            int n = number - ((int) (number * 0.1)) * 10;
            if (n % 2 == 0) {
                sumEven += n;
            } else {
                sumOdd += n;
            }
            number /= 10;
        }
        return sumEven == sumOdd;
    }

    public static boolean balancedNumber(long number) {
        String[] digits = Long.toString(number).split("");
        int sumEven = 0;
        int sumOdd = 0;
        for (String d : digits) {
            int n = Integer.parseInt(d);
            if (n % 2 == 0) {
                sumEven += n;
            } else {
                sumOdd += n;
            }
        }
        return sumEven == sumOdd;
    }

    public static int numberOfParts(String s1, String s2) {
        char[] smaller = (s1.length() > s2.length() ? s2 : s1).toCharArray();
        char[] bigger = (s1.length() > s2.length() ? s1 : s2).toCharArray();

        int counter = 0;
        for (int i = 0; i < bigger.length; i++) {
            if (smaller[i] == bigger[i]) {

            }
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(balancedNumber(24));
    }
}
