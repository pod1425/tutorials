package hw.loops_task;

import java.util.Scanner;

public class LoopUtils implements hw.loops_task.ILoopUtils {
    @Override
    public double askNumber(double min, double max) {
        double num;
        Scanner sc = new Scanner(System.in);
        while (true) {
            num = sc.nextDouble();
            if (num < min || num > max) {
                System.out.println("Invalid Input;");
            } else {
                return num;
            }
        }
    }

    @Override
    public long factorial(short number) {
        long factorial = 1;
        for (short i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }

    @Override
    public double testMachineSpeed() {
        long start = System.nanoTime();
        for (long i = 0; i < 1000000000; i++) {

        }
        long end = System.nanoTime();
        return (end - start) / 1000000.0;
    }

    @Override
    public void printPrimes(int max) {
        for (int num = 2; num <= max; num++) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    private boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public void printMultiplicationTable(int number) {
        for (int i = 1; i <= 10; i++) {
            int result = number * i;
            System.out.println(number + " * " + i + " = " + result);
        }
    }


    public void printPowersOf2(int amount) {
        int power = 1;
        for (int i = 1; i <= amount; i++) {
            System.out.print(power + " ");
            power *= 2;
        }
    }
}
