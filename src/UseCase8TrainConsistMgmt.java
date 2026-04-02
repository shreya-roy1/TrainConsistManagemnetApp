import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UseCase8TrainConsistMgmt {

    static class Bogie {
        String name;
        int capacity;

        Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }

        @Override
        public String toString() {
            return String.format("Bogie{name='%s', capacity=%d}", name, capacity);
        }
    }

    public static void main(String[] args) {
        System.out.println("==============================================");
        System.out.println(" UC8 - Filter Passenger Bogies Using Streams ");
        System.out.println("==============================================\n");

        // 1. User creates a list of bogies (Reusing logic from UC7)
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper Class", 72));
        bogies.add(new Bogie("AC First Class", 24));
        bogies.add(new Bogie("General Class", 90));
        bogies.add(new Bogie("AC 3-Tier", 64));
        bogies.add(new Bogie("Executive Chair Car", 56));

        System.out.println("--- Original Bogie List ---");
        bogies.forEach(System.out::println);

        // 2. System converts list to stream
        // 3. filter() applied (Capacity > 60)
        // 4. Matching bogies collected into a new list
        List<Bogie> highCapacityBogies = bogies.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());

        // 5. Displayed Filtered Bogies
        System.out.println("\n--- High-Capacity Bogies (Capacity > 60) ---");
        if (highCapacityBogies.isEmpty()) {
            System.out.println("No bogies match the criteria.");
        } else {
            highCapacityBogies.forEach(System.out::println);
        }

        // Verification: Original list integrity (Test Case requirement)
        System.out.println("\n--- Verification: Original List Unchanged ---");
        System.out.println("Original List Size: " + bogies.size());
    }
}