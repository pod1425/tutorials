package lesson3;

public class Methods {

    static void sayHello() {
        System.out.println("Hello!");
    }

    //number = num;
    static void printNumber(int number) {
        System.out.println("Number: " + number);
    }

    static int sum(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Program started!");
        int num = sum(5, 9);
        printNumber(num);
        num = sum(7, 20);
        printNumber(num);
    }
}
