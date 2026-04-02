import java.util.ArrayList;
import java.util.List;

// 1. Create a custom exception class
class InvalidCapacityException extends Exception {
    public InvalidCapacityException(String message) {
        super(message);
    }
}

public class UseCase14TrainConsistMgmt {

    static class Bogie {
        String type;
        int capacity;

        // 2. & 4. Validate inside constructor and declare 'throws'
        Bogie(String type, int capacity) throws InvalidCapacityException {
            if (capacity <= 0) {
                // 3. Throw exception when capacity is invalid
                throw new InvalidCapacityException("Capacity must be greater than zero");
            }
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
        System.out.println(" UC14 - Handle Invalid Bogie Capacity (Exception) ");
        System.out.println("===============================================\n");

        List<Bogie> trainConsist = new ArrayList<>();

        // Scenario A: Attempting to create a valid bogie
        try {
            System.out.println("Attempting to create Sleeper Class (72 seats)...");
            Bogie validBogie = new Bogie("Sleeper", 72);
            trainConsist.add(validBogie);
            System.out.println("✔ Success: " + validBogie);
        } catch (InvalidCapacityException e) {
            System.out.println("❌ Failed: " + e.getMessage());
        }

        // Scenario B: Attempting to create a bogie with zero capacity
        try {
            System.out.println("\nAttempting to create General Class (0 seats)...");
            Bogie invalidBogie = new Bogie("General", 0);
            trainConsist.add(invalidBogie);
        } catch (InvalidCapacityException e) {
            // 5. Ensure invalid bogies are never added
            System.out.println("❌ Failed: " + e.getMessage());
        }

        // Scenario C: Attempting to create a bogie with negative capacity
        try {
            System.out.println("\nAttempting to create AC Chair Car (-10 seats)...");
            Bogie negativeBogie = new Bogie("AC Chair", -10);
            trainConsist.add(negativeBogie);
        } catch (InvalidCapacityException e) {
            System.out.println("❌ Failed: " + e.getMessage());
        }

        System.out.println("\n--- Final Valid Train Consist ---");
        trainConsist.forEach(System.out::println);
        System.out.println("Total Bogies added: " + trainConsist.size());
    }
}