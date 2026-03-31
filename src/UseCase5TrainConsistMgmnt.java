import java.util.LinkedHashSet;
import java.util.Set;

public class UseCase5TrainConsistMgmnt {
    public static void main(String[] args) {
        System.out.println("==========================================");
        System.out.println(" UC5 - Preserve Insertion Order of Bogies ");
        System.out.println("==========================================\n");

        // LinkedHashSet preserves order and ensures uniqueness
        Set<String> formation = new LinkedHashSet<>();

        // Attaches bogies in order
        formation.add("General-1");
        formation.add("Sleeper-1");
        formation.add("Sleeper-2");

        // Avoids duplicate bogies (This call will be ignored by the Set)
        formation.add("Sleeper-1"); 

        // Displays final train formation
        System.out.println("Train Formation (Unique & Ordered): " + formation);
    }
}