package practice.p4;

import java.util.Arrays;

public class Demo {

    // видалити перший та останній символ в строці
    public static String remove(String str) {
        return str.substring(1, str.length() - 1);
    }
    // зробити строку довжини size яка буде 1010101010
    public static String stringy(int size) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= size; i++) {
            sb.append(i % 2);
        }
        return sb.toString();
    }

    // подвоїти всі букви
    public static String doubleChar(String s){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            sb.append(s.charAt(i)).append(s.charAt(i));
        }
        return sb.toString();
    }

    // дано строку цифр, всі значення менше 5 замінити на 0, більше - на 1
    public static String fakeBin(String numberString) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < numberString.length(); i++) {
            sb.append(numberString.charAt(i) < '5' ? 0 : 1);
        }
        return sb.toString();
    }

    public static int solve(String s){
        int counter = 0;
        int maxCounter = counter;

        for (int i = 0; i < s.length(); i++) {
            if ("aeuio".indexOf(s.charAt(i)) != -1) {
                counter++;
            } else {
                maxCounter = Math.max(maxCounter, counter);
                counter = 0;
            }
        }
        return Math.max(maxCounter, counter);
    }

    public static void main(String[] args) {
        System.out.println(solve("mnopqriouaeiopqrstuvwxyuaeiouaeiou"));
        System.out.println(Arrays.toString("Hello there my friend".split("[bcdfghjklmnpqrstvwxyz]")));
        //System.out.println(stringy(15));
    }
}
