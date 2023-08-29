package lesson_strings;

import java.util.Arrays;
import java.util.Locale;

public class Demo {
    public static void main(String[] args) {
        String str = "HeLLo";
        System.out.println(str.toUpperCase());
        System.out.println(str);

        System.out.println(str.equalsIgnoreCase("hEllO"));
        System.out.println(Arrays.toString(str.getBytes()));
        str += " WoRLD!";
        //str = str + " WoRLD!";
        //str = str.concat(" WoRLD!");
        System.out.println(str);
        System.out.println(str.toLowerCase().contains("hello".toLowerCase()));
        str = str.replace('L', 'l');
        System.out.println(str);
        System.out.println(str.startsWith("R"));
        System.out.println(str.startsWith("l", 2));
        str = str.substring(0, str.indexOf(' '));
        System.out.println(str);
        System.out.println("*".repeat(str.length()));

    }
}
