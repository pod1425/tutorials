package practice.midterm;

import java.util.Random;

public class Task11 {
    public static int decompose(int number) {
        int power = 0;
        int multiplier = 1;
        int res = 0;
        do {
            power = -1;
            do {
                power++;
                res = multiplier * (int) Math.pow(2, power);
            } while (res < number);
            multiplier++;
        } while (res != number);
        return power;
    }

    public static String commonPrefix(String s1, String s2) {
        if (s1.length() < s2.length()) {
            s2 = s2.substring(0, s1.length());
        } else if (s1.length() > s2.length()) {
            s1 = s1.substring(0, s2.length());
        }

        for (int i = s1.length(); i > 0; i--) {
            String substr = s1.substring(0, i);
            if (substr.equals(s2.substring(0, i))) {
                return substr;
            }
        }
        return "";
    }

    public static void drawTurtle(float x, float y) {
        // draw turtle here...
    }

    static float sizeX = 800;
    static float sizeY = 600;

    public static void drawTurtles() {
        Random rand = new Random();
        for (int i = 0; i < 8; i++) {
            drawTurtle(rand.nextFloat() % sizeX, rand.nextFloat() % sizeY);
        }
    }

    public static void main(String[] args) {
        System.out.println(decompose(27));
        System.out.println(commonPrefix("motion", "program"));
    }
}
