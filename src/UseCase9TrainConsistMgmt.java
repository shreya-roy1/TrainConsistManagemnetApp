import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class UseCase9TrainConsistMgmt {

    // Inner Bogie class representing a passenger or goods bogie
    static class Bogie {
        String type; // e.g., "Sleeper", "AC Chair", "General"
        int capacity;

        Bogie(String type, int capacity) {
            this.type = type;
            this.capacity = capacity;
        }

        @Override
        public String toString() {
            return String.format("Bogie[Type=%s, Capacity=%d]", type, capacity);
        }
    }

    public static void main(String[] args) {
        System.out.println("===============================================");
        System.out.println(" UC9 - Group Bogies by Type (groupingBy) ");
        System.out.println("===============================================\n");

        // 1. User creates a list of bogies
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("General", 90));

        System.out.println("--- Original Flat Bogie List ---");
        bogies.forEach(System.out::println);

        // 2. System converts list to stream
        // 3. groupingBy() collector is applied
        // 4. Bogies are grouped into a Map<String, List<Bogie>>
        Map<String, List<Bogie>> groupedBogies = bogies.stream()
                .collect(Collectors.groupingBy(b -> b.type));

        // 5. Grouped result is displayed
        System.out.println("\n--- Grouped Bogie Report ---");
        groupedBogies.forEach((type, list) -> {
            System.out.println("Category: " + type.toUpperCase());
            list.forEach(b -> System.out.println("  -> " + b));
            System.out.println("  Count: " + list.size());
        });

        // Verification: Original List Integrity
        System.out.println("\n--- Integrity Check ---");
        System.out.println("Original list remains unchanged. Size: " + bogies.size());
    }
}