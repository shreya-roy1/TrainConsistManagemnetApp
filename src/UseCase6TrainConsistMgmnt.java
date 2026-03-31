import java.util.HashMap;
import java.util.Map;

public class UseCase6TrainConsistMgmnt {
    public static void main(String[] args) {
        System.out.println("==========================================");
        System.out.println(" UC6 - Map Bogie to Capacity (HashMap) ");
        System.out.println("==========================================\n");

        // HashMap stores data in key -> value format
        Map<String, Integer> capacityMap = new HashMap<>();

        // Insert bogie capacities
        capacityMap.put("B1", 72);
        capacityMap.put("AC1", 18);
        capacityMap.put("Gen1", 90);

        // Iterates through map entries
        System.out.println("Bogie Capacity Details:");
        for (Map.Entry<String, Integer> entry : capacityMap.entrySet()) {
            System.out.println("Bogie: " + entry.getKey() + " | Capacity: " + entry.getValue());
        }

        // Displays lookup-based access
        System.out.println("\nLookup Capacity for B1: " + capacityMap.get("B1"));
    }
}