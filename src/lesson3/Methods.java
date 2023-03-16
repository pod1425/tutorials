package lesson3;

public class Methods {

    public static void print(String text) {
        System.out.println(text);
    }

    public static void sum(int a, int b) {
        int sum = a + b;
        System.out.println(sum);
        //return sum;
    }

    public static double calculateDiscriminant(double a, double b, double c) {
        double D = b * b - 4 * a * c;
        return D;
    }

    public static void main(String[] args) {
        //2x^2 + 6x - 11 = 0
        double d = calculateDiscriminant(2, 6, -11);
        double x1 = -6 - Math.sqrt(d) / 2 * 2;
        System.out.println(x1);
        //System.out.println(sum);
        //print("Hello!");
        /*
        int a = 8;
        int b = 10;
        int sum = sum(a, b);
        print(a + " + " + b + " = " + sum);*/
    }
}
