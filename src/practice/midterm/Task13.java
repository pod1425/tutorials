package practice.midterm;

public class Task13 {

    public static boolean isPrime(int n) {
        if (n <= 0) {
            return false;
        }
        for (int i = 2; i < n / 2 + 1; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static int goldbach(int n) {
        int maxPrime = 0;
        for (int i = 0; i <= n; i++) {
            if (isPrime(i)) {
                maxPrime = i;
            }
        }
        n -= maxPrime;
        n /= 2;
        double q = Math.sqrt(n);
        if (q % 2 == 1 || q == 0) {
            return maxPrime;
        } else {
            return -1;
        }
    }

    public static int combineNumbers(int n, int m) {
        int res = 0;
        int digitM;
        int digitN;
        int digitNum = 1;
        while (n > 0 || m > 0) {
            digitN = n % 10;
            digitM = m % 10;
            res += Math.max(digitM, digitN) * digitNum;

            n /= 10;
            m /= 10;
            digitNum *= 10;
        }
        return res;
    }

    public static String removeDuplicates(String str) {
        StringBuilder sb = new StringBuilder();
        char[] arr = str.toCharArray();
        sb.append(arr[0]);
        for (int i = 1; i < arr.length; i++ ) {
            if (arr[i] == arr[i - 1]) {
                continue;
            }
            sb.append(arr[i]);
        }
        return sb.toString();
    }

    public static long fact(long n) {
        return n == 0 ? 1 : fact(n - 1) * n;
    }

    public static int inverseFact(int n) {
        for (int i = 1; i <= n; i++) {
            if (fact(i) >= n) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(inverseFact(5041));
    }
}
