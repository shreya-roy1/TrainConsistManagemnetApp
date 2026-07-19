class BogieSearch {

    /**
     * Performs a linear search to find a specific bogie ID in the provided array.
     * Implements defensive checks for null input arrays, keys, and elements.
     *
     * @param bogieIds Array of bogie IDs to search through.
     * @param key      The bogie ID to search for.
     * @return true if the key is found, false otherwise.
     */
    public static boolean linearSearch(String[] bogieIds, String key) {
        // Defensive check for null inputs
        if (bogieIds == null || key == null) {
            return false;
        }

        for (int i = 0; i < bogieIds.length; i++) {
            // Safe comparison by checking if element is not null
            if (bogieIds[i] != null && bogieIds[i].equals(key)) {
                return true; // Match found → early termination
            }
        }

        return false; // No match found
    }
}