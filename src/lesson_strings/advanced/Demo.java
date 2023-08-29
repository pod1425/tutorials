package lesson_strings.advanced;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo {


    private static int countHashTags(String s) {
        char[] arr = s.toCharArray();
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '#') {
                counter++;
            }
        }
        return counter;
    }

    public static String[] extractHashTags(String text) {
        String[] result = new String[countHashTags(text)];
        Matcher matcher = Pattern.compile("#\\w+").matcher(text);
        for (int i = 0; matcher.find(); i++) {
            result[i] = matcher.group().replace("#", "");
        }
        return result;
    }

    public static void main(String[] args) {
        /*
        [abc] - matches only one of symbols (a, b or c)
        [^abc] - matches only one symbol except for a, b or c
        [a-z] - matches all symbols between a and z

        . - any symbol, only one
        ^ - beginning of a string
        $ - end of a string

        \d - any digit
        \s - whitespace character
        \b - beginning of the word
        \w - symbols that are suitable for identifier
        \\u XXXX - unicode character, where XXXX is its numeric value in hex

        () - exact phrase, if need to use any of operators below on it
        n+ - matches one or more letters n
        n* - matches zero or more letters n
        n? - matches zero or one letters n

        n{x} - contains "n" x times
        n{x,y} - contains "n" x to y times
        n{x,} - contains "n" at least x times
         */

        String text = "tag them \uD83D\uDE02\uD83D\uDE02\uD83D\uDE02 Daily dose of Coding and Technology Meme\n" +
                "Follow @programmingofficial and Tag Friends.\n" +
                ".\n" +
                ".\n" +
                ".\n" +
                "#programmer #programming #coding #developer #elonmusk\n" +
                "#coder #programmingofficial #meme #java #javascript #python\n" +
                "#webdeveloper #php #software #softwaredeveloper\n" +
                "#computerscience #tech #webdesign #gaming\n" +
                "#technology #webdevelopment #engineer #development\n" +
                "#machinelearning #programmers #softwareengineer\n" +
                "#programmingmemes #computerengineering #pythonprogramming\n" +
                "#stackoverflow";
        String[] res = null;
        long start = System.nanoTime();
        res = extractHashTags(text);
        long end = System.nanoTime();
        System.out.println(Arrays.toString(res));
        System.out.println(end - start);

        /*
        StringBuilder text = new StringBuilder("Hello");
        System.out.println(text);
        long start = System.nanoTime();
        text.append(" world!");
        long end = System.nanoTime();
        System.out.println("It took " + (end - start) + " nanoseconds");
        String finalText = text.toString();
        System.out.println(finalText);
        */
    }
}
