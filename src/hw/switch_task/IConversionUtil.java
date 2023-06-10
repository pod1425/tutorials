package hw.switch_task;

/**
 * Practice topic: ternary operator, switch operator
 * (usage of if operator is restricted in this task)
 *
 * Hint: you may create as many methods as you wish, but only those listed in this interface should be public
 */
public interface IConversionUtil {
    /**
     * Converts integer digit into a word.
     * If the parameter is invalid, should return empty string
     *
     * @param number number to convert, from 0 to 9
     * @return word representation of passed number or empty string if argument was invalid
     */
    String numberToWord(int number);

    /**
     * Returns string form of boolean value
     *
     * @param value value to convert
     * @return string representation of passed parameter
     */
    String booleanAsString(boolean value);

    /**
     * Compares passed number to zero.
     *
     * @param number number to be compared
     * @return -1 if number is less than 0, 0 if number is equal to 0 and 1 if number is bigger than zero
     */
    int compareToZero(double number);

    /**
     * Tells if the chess square is black or white. Coordinates of the square are passed
     * as parameters into this method
     *
     * Hint: if you examine chess board closely, you will notice, that when parity of
     * square coordinates match, that means square is black, and when it doesn't match,
     * e.g. when one is even and other is odd, it is white
     *
     * Examples: A1, G5 and D8 are all black, while A2 or E6 is white
     *
     * @param letter the letter of chess square coordinate
     * @param number the number of chess square coordinate
     * @return true if square is white, false if square is black
     */
    boolean chessSquareIsWhite(char letter, int number);


}
