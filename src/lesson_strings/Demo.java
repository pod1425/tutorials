package lesson_strings;

import java.util.Arrays;
import java.util.Locale;


public class Demo {

    public static String toCamelCase(String s) {
        StringBuilder result = new StringBuilder();
        boolean nextsymbol = false;

        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                if (nextsymbol) {
                    result.append(Character.toUpperCase(c));
                    nextsymbol = false;
                } else {
                    result.append(Character.toLowerCase(c));
                }
            } else {
                nextsymbol = true;
            }
        }

        return result.toString();
    }

    public static byte[] parseIp(String str) {
        if (!str.matches("^([0-9]+\\.){3}[0-9]+$")) {
            return null;
        }
        String[] arr = str.split("\\.");
        byte[] res = new byte[4];

        for (int i = 0; i < res.length; i++) {
            try {
                res[i] = (byte) (Byte.parseByte(arr[i]) + 128);
            } catch (NumberFormatException ex) {
                return null;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(parseIp("44.240.0.78")));

        /*String str = "HeLLo";
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
        System.out.println("*".repeat(str.length()));*/

    }
}
