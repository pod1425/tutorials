package lesson4;

import java.util.Scanner;

public class Methods {
    public static int perimeter(int a, int b) {
        return 2 * (a + b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*System.out.println("Enter dimensions of your rect: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println("Perimeter: " + perimeter(a, b));*/
        System.out.println("Enter any message: ");
        String message = scanner.nextLine();
        System.out.println("You entered: " + message);
    }
}
