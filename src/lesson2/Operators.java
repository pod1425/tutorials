package lesson2;

public class Operators {

    public static void main(String[] args) {
        //R -> L
        int num = 50;
        //L -> R
        int number = 10 * num++;
        System.out.println(number);
        System.out.println(num);
    }
}
