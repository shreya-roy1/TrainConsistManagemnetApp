class BogieSearch {

    public static boolean linearSearch(String[] bogieIds, String key) {

        for (int i = 0; i < bogieIds.length; i++) {
            // Compare using equals()
            if (bogieIds[i].equals(key)) {
                return true; // Match found → early termination
            }
        }

        return false; // No match found
    }
}