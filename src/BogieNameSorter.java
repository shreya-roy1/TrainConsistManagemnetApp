import java.util.Arrays;

class BogieNameSorter {

    /**
     * Sorts the array of bogie names in alphabetical order using Java's built-in quicksort.
     * Includes a null-safety check to prevent NullPointerException.
     *
     * @param bogieNames Array of bogie names to sort.
     */
    public static void sortBogieNames(String[] bogieNames) {
        if (bogieNames == null || bogieNames.length <= 1) {
            return; // Nothing to sort or already sorted
        }
        // Built-in sorting
        Arrays.sort(bogieNames);
     }

    /**
     * Prints the bogie names array. Handles null values gracefully.
     *
     * @param bogieNames Array of bogie names to print.
     */
    public static void printBogieNames(String[] bogieNames) {
        if (bogieNames == null) {
            System.out.println("null");
        } else {
            System.out.println(Arrays.toString(bogieNames));
        }
    }
}