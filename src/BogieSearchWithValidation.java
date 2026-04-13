class BogieSearchWithValidation {

    public static boolean searchBogie(String[] bogieIds, String key) {

        // ✅ Fail-fast validation
        if (bogieIds == null || bogieIds.length == 0) {
            throw new IllegalStateException(
                "Search cannot be performed: No bogies available in the train."
            );
        }

        // ✅ Linear search (can also plug in binary search here)
        for (String id : bogieIds) {
            if (id.equals(key)) {
                return true;
            }
        }

        return false; // Not found
    }
}