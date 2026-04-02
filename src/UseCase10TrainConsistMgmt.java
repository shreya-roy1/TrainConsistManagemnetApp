import java.util.ArrayList;
import java.util.List;

public class UseCase10TrainConsistMgmt {

    // Bogie class with capacity attribute
    static class Bogie {
        String type;
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
        System.out.println(" UC10 - Count Total Seats in Train (reduce) ");
        System.out.println("===============================================\n");

        // 1. User creates a list of bogies
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("General", 90));

        System.out.println("--- Current Consist Composition ---");
        bogies.forEach(System.out::println);

        // 2. System converts the list into a stream
        // 3. map() extracts capacity values (Transforming Bogie -> Integer)
        // 4. reduce() sums the capacities using an identity of 0 and Integer::sum
        int totalSeats = bogies.stream()
                .map(b -> b.capacity)           // Extract capacity
                .reduce(0, Integer::sum);       // Aggregate into a single total

        // 5. Total seating capacity is displayed
        System.out.println("\n-----------------------------------------------");
        System.out.println(" TOTAL SEATING CAPACITY: " + totalSeats);
        System.out.println("-----------------------------------------------");

        // Verification for Test Cases
        verifyIntegrity(bogies);
    }

    private static void verifyIntegrity(List<Bogie> originalList) {
        System.out.println("\n[Verification] Original list integrity maintained: " + (originalList.size() == 5));
    }
}