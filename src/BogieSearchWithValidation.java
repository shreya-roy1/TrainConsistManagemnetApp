class BogieSearchWithValidation {

    /**
     * Searches for a bogie ID with strict fail-fast validation.
     *
     * @param bogieIds Array of bogie IDs, must not be null or empty.
     * @param key      The search key, must not be null.
     * @throws IllegalStateException if bogieIds is null or empty.
     * @throws IllegalArgumentException if the search key is null.
     */
    public static boolean searchBogie(String[] bogieIds, String key) {

        // ✅ Fail-fast validation for array
        if (bogieIds == null || bogieIds.length == 0) {
            throw new IllegalStateException(
                "Search cannot be performed: No bogies available in the train."
            );
        }

        // ✅ Fail-fast validation for search key
        if (key == null) {
            throw new IllegalArgumentException("Search key cannot be null.");
        }

        // ✅ Linear search with null safety for elements
        for (String id : bogieIds) {
            if (id != null && id.equals(key)) {
                return true;
            }
        }

        return false; // Not found
    }
}