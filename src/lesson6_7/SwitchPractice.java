package lesson6_7;

import java.util.Scanner;

public class SwitchPractice {

    public static String processNumber(int number) {
        switch (number) {
            case 1, 2:
                return "You inputted number one or two";
            case 3:
                return "You inputted number three";
            case 4:
                return "You inputted number four";
            default:
                return "You inputted wrong number";
        }
    }

    public static String convert(Animal animal){
        if (animal instanceof Dog) {
            return "Dog: " + animal.getName();
        } else if (animal instanceof Lion) {
            return "Lion: " + animal.getName();
        } else {
            return "Unidentified animal: " + animal.getName();
        }
    }

    public static String numberToWord(int number) {
        switch (number) {
            case 1: return "one";
            case 2: return "two";
            case 3: return "three";
            case 4: return "four";
            case 5: return "five";
            case 6: return "six";
            case 7: return "seven";
            case 8: return "eight";
            case 9: return "nine";
            case 0: return "zero";
            default: return "undefined";
        }
    }

    public static void main(String[] args) {
        System.out.println(numberToWord(4));
    }
}
