import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class UseCase7TrainConsistMgmt {

    // Inner Bogie class to model passenger bogies
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
        System.out.println(" UC7 - Sort Bogies by Capacity (Comparator) ");
        System.out.println("==============================================\n");

        // Create List of passenger bogies
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper Class", 72));
        bogies.add(new Bogie("AC First Class", 24));
        bogies.add(new Bogie("General Class", 90));
        bogies.add(new Bogie("AC 3-Tier", 64));

        System.out.println("--- Unsorted Bogies ---");
        bogies.forEach(System.out::println);

        // Sorting using Comparator logic (Ascending order of capacity)
        Collections.sort(bogies, new Comparator<Bogie>() {
            @Override
            public int compare(Bogie b1, Bogie b2) {
                return Integer.compare(b1.capacity, b2.capacity);
            }
        });

        System.out.println("\n--- Sorted Bogies by Capacity ---");
        for (Bogie b : bogies) {
            System.out.println(b);
        }
    }
}