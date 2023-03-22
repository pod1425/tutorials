package lesson5;

class Utils {
    public static final double PI = 3.141592;

    static int num = 5;

    void printNum() {
        System.out.println("The number here is " + num);
    }

    static void print(String text) {
        System.out.println(text);
    }
}

public class DemoStatics {
    public static void main(String[] args) {
        Utils utils = new Utils();
        Utils utils1 = new Utils();
        utils.printNum();
        utils1.printNum();

        Utils.num = 8;
        utils.printNum();
        utils1.printNum();

        //Utils.print("Hello there! This is Pi number: " + Utils.PI);
    }
}
