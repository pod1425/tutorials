package hw.switch_task;

public class ConversionUtil implements IConversionUtil {
    @Override
    public String numberToWord(int number) {
        switch (number) {
            case 0:
                return "zero";
            case 1:
                return "one";
            case 2:
                return "two";
            case 3:
                return "three";
            case 4:
                return "four";
            case 5:
                return "five";
            case 6:
                return "six";
            case 7:
                return "seven";
            case 8:
                return "eight";
            case 9:
                return "nine";
            default:
                return "";
        }
    }

    @Override
    public String booleanAsString(boolean value) {
        return value ? "true" : "false";
    }

    @Override
    public int compareToZero(double number) {
        return number < 0 ? -1 : (number > 0 ? 1 : 0);
    }

    @Override
    public boolean chessSquareIsWhite(char letter, int number) {
        return (letter % 2 == 0) != (number % 2 == 0);
    }

}
