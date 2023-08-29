package hw.arrays_task;

/**
 * All methods in resulting class should be static
 *
 * You are not allowed to use any external library functions, especially
 * the Arrays class. The goal of this task is actually implement your own
 * copy of Arrays class
 */
public interface IArrayHelper {
    /**
     * Prints array to a console in fancy manner.
     *
     * Example input: { "Hello", "There is a hint here", "You can pass any type of array into this method",
     * "Its because the parameter type is Object[]", n"And in arrays of element type Object you can store anything!" }
     *
     * Example output:
     * [ Hello, There is a hint here, You can pass any type of array into this method, Its because the parameter type is Object[], And in arrays of element type Object you can store anything! ]
     *
     * @param array Array to be printed
     */
    void print(Object[] array);

    /**
     * Prints array as numbered list
     *
     * Example input: {"Hello again", "This time there are no hints here!", "Goodbye"}
     *
     * Example output:
     * 1. Hello again
     * 2. This time there are no hints here!
     * 3. Goodbye
     *
     * @param array Array to be printed
     */
    void printAsList(Object[] array);

    /**
     * Generates random sequence of numbers.
     *
     * Hint: use object of type Random to generate numbers
     * @param maxElemValue Upper bound for element values. For example, if 100 passed here, output array will only
     *                     contain numbers from 0 to 100
     * @param amount Amount of elements in resulting array
     * @return Array that contains generated random sequence
     */
    int[] getRandomSequence(int maxElemValue, int amount);

    /**
     * Checks if two arrays are identical
     *
     * Hint: arrays are identical if two conditions are met:
     * 1. Arrays both have same length (amount of elements matches)
     * 2. All elements match in both arrays
     *
     * Optional task: implement a null-check and check for the case when two arrays
     * are pointers to the same memory block
     * @param array1 First array to compare
     * @param array2 Second array to compare
     * @return true if arrays are identical, false otherwise
     */
    boolean equals(Object[] array1, Object[] array2);

    /**
     * Calculates arithmetic average of given array
     * @param array Array to calculate average from
     * @return Average value of all array elements
     */
    double avg(int[] array);

    /**
     * Searches for element in array
     * @param array Array to search element in
     * @param element Value of element that should be found
     * @return index of found element or -1 if element with that value is not found
     */
    int indexOf(Object[] array, Object element);

    /**
     * Finds minimal value of array
     * @param array Array to search in
     * @return minimal value from passed array
     */
    int min(int[] array);

    /**
     * Finds maximal value of array
     * @param array Array to search in
     * @return maximal value from passed array
     */
    int max(int[] array);

    /**
     * Shuffles elements around randomly
     *
     * Hint: use Random once again to generate indexes,
     * pick random elements and change places with other random elements
     * @param array Array to be shuffled
     */
    void shuffle(Object[] array);

    /**
     * Concatenates two arrays.
     *
     * Example inputs:
     * 1 {"This", "message", "was"}
     * 2 {"divided", "into", "two", "arrays"}
     *
     * Example output:
     * {"This", "message", "was", "divided", "into", "two", "arrays"}
     *
     * Hint 1: the length of resulting array should be exactly sum of lengths of two passed arrays
     *
     * Hint 2: keep in mind that while every separate array has its own indexation, resulting array will
     * have consecutive indexes, so, for example, string "into" from example input array will have index of 1,
     * and in output it will have index of 4
     * @param array1 First part of array
     * @param array2 Second part of array
     * @return Whole array
     */
    Object[] concat(Object[] array1, Object[] array2);

}
