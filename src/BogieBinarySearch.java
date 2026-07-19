import java.util.Arrays;

class BogieBinarySearch {

    /**
     * Performs a binary search to find a specific bogie ID in the provided array.
     * Sorts the array before performing the search. Prevents potential integer overflow
     * when calculating the middle index and ensures null safety for input arguments.
     *
     * @param bogieIds Array of bogie IDs to search through.
     * @param key      The bogie ID to search for.
     * @return true if the key is found, false otherwise.
     */
    public static boolean binarySearch(String[] bogieIds, String key) {

        // Handle null/empty array or null key
        if (bogieIds == null || bogieIds.length == 0 || key == null) {
            return false;
        }

        // Ensure array is sorted (precondition)
        Arrays.sort(bogieIds);

        int low = 0;
        int high = bogieIds.length - 1;

        while (low <= high) {
            // Prevent integer overflow during mid calculation
            int mid = low + (high - low) / 2;

            // Safe comparison against array elements
            if (bogieIds[mid] == null) {
                low = mid + 1;
                continue;
            }

            int comparison = key.compareTo(bogieIds[mid]);

            if (comparison == 0) {
                return true; // Found
            } else if (comparison < 0) {
                high = mid - 1; // Search left
            } else {
                low = mid + 1; // Search right
            }
        }

        return false; // Not found
    }
}