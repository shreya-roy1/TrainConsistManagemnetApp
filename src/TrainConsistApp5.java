import java.util.Arrays;

public class TrainConsistApp {

    public static void main(String[] args) {

        // Unsorted input (will be sorted internally)
        String[] bogieIds = {"BG309","BG101","BG550","BG205","BG412"};

        String searchKey = "BG205";

        System.out.println("Before Sorting:");
        System.out.println(Arrays.toString(bogieIds));

        boolean found = BogieBinarySearch.binarySearch(bogieIds, searchKey);

        System.out.println("After Sorting:");
        System.out.println(Arrays.toString(bogieIds));

        if (found) {
            System.out.println("✅ Bogie ID found using Binary Search.");
        } else {
            System.out.println("❌ Bogie ID not found.");
        }

        System.out.println("🚆 Binary Search completed efficiently.");
    }
}