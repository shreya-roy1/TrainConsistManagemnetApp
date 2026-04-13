public class TrainConsistApp4 {

    public static void main(String[] args) {

        // List of bogie IDs (unsorted)
        String[] bogieIds = {"BG101","BG205","BG309","BG412","BG550"};

        String searchKey = "BG309"; // Example search

        System.out.println("Searching for Bogie ID: " + searchKey);

        boolean found = BogieSearch.linearSearch(bogieIds, searchKey);

        if (found) {
            System.out.println("✅ Bogie ID found in the train consist.");
        } else {
            System.out.println("❌ Bogie ID not found.");
        }

        System.out.println("🚆 Search operation completed successfully.");
    }
}