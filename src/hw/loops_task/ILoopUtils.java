package hw.loops_task;

/**
 * Reminder: in implementation class, all the methods from this interface should
 * be public. Additional methods are allowed, but they should be private
 */
public interface ILoopUtils {
    /**
     * Repeatedly asks user for a number until user inputs value between min and max
     * and returns the number when it is correct
     * @param min lowest bound of a number to be inputted
     * @param max highest bound of a number to be inputted
     * @return number that was inputted
     */
    double askNumber(double min, double max);

    /**
     * calculates a factorial. Should only accept numbers between 0 and 30.
     * If a number is not in that range, method should return value -1
     * @param number number to calculate factorial of
     * @return factorial of passed number
     */
    long factorial(short number);

    /**
     * Counts from 0 to one billion without doing anything else and then returns the time it took
     * to perform that operation in milliseconds
     *
     * Hint 1: you can obtain current time in nanoseconds by calling System.nanoTime()
     *
     * Hint 2: to calculate a time it takes to perform an operation, simply create variable
     * long start and assign current time in nanoseconds to it. After operation is done,
     * simply get current time one more time and subtract start variable from it. Result
     * of this expression will be amount of time in nanoseconds it took to perform that operation
     * @return amount of time it took to test machine, in milliseconds
     */
    double testMachineSpeed();

    /**
     * Prints out all prime numbers between 1 and given parameter, in a line, separated by whitespaces
     *
     * Hint: prime number is one that gives remainder of 0 only when divided by itself and 1
     * @param max upper bound for numbers
     */
    void printPrimes(int max);

    /**
     * Prints out multiplication table for given number. E.g., prints results of multiplying
     * given number by 10 numbers, from 1 to 10
     * @param number number to be multiplied
     */
    void printMultiplicationTable(int number);

    /**
     * Prints out selected amount of numbers that are power of 2.
     * For example, with input 6 this method should print 1 2 4 8 16 32
     * @param amount amount of numbers to be printed
     */
    void printPowersOf2(int amount);
}
