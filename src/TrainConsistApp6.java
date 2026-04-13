public class TrainConsistApp6 {

    public static void main(String[] args) {

        // 🔹 Test Case 1: Empty array (should throw exception)
        String[] emptyBogieList = {};

        try {
            System.out.println("Searching in empty train...");
            BogieSearchWithValidation.searchBogie(emptyBogieList, "BG101");
        } catch (IllegalStateException e) {
            System.out.println("❌ Exception: " + e.getMessage());
        }

        // 🔹 Test Case 2: Valid search
        String[] bogieIds = {"BG101","BG205","BG309"};

        try {
            System.out.println("\nSearching in valid train...");
            boolean found = BogieSearchWithValidation.searchBogie(bogieIds, "BG205");

            if (found) {
                System.out.println("✅ Bogie found.");
            } else {
                System.out.println("❌ Bogie not found.");
            }

        } catch (IllegalStateException e) {
            System.out.println("❌ Exception: " + e.getMessage());
        }

        System.out.println("\n🚆 System executed safely with proper validation.");
    }
}