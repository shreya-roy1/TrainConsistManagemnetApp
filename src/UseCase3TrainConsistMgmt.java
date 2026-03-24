import java.util.HashSet;
import java.util.Set;

public class UseCase3TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println("=== UC3 - Track Unique Bogie IDs ===");
        System.out.println("========================================\n");

        // Create a Set to store unique bogie IDs
        // HashSet stores only unique values
        Set<String> bogies = new HashSet<>();

        // ---- ADD IDs (including duplicates) ----
        bogies.add("BG101");
        bogies.add("BG102");
        bogies.add("BG103");
        bogies.add("BG104");

        // Duplicate entries (will be ignored automatically)
        bogies.add("BG101");
        bogies.add("BG102");

        // ---- DISPLAY unique bogies ----
        System.out.println("Unique Bogie IDs:");
        for (String bogie : bogies) {
            System.out.println(bogie);
        }

        // ---- CHECK existence ----
        String searchId = "BG103";
        if (bogies.contains(searchId)) {
            System.out.println("\n" + searchId + " exists in the set.");
        } else {
            System.out.println("\n" + searchId + " does NOT exist.");
        }

        // ---- TOTAL COUNT ----
        System.out.println("\nTotal unique bogies: " + bogies.size());
    }
}