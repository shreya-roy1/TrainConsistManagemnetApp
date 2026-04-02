import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UseCase13TrainConsistMgmt {

    static class Bogie {
        String name;
        int capacity;

        Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }
    }

    public static void main(String[] args) {
        System.out.println("===============================================");
        System.out.println(" UC13 - Performance Comparison (Loops vs Streams) ");
        System.out.println("===============================================\n");

        // 1. Prepare a large collection of bogies for testing (e.g., 10,000 bogies)
        List<Bogie> bogies = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            bogies.add(new Bogie("Bogie-" + i, (i % 100))); 
        }

        // --- LOOP BASED FILTERING ---
        long loopStart = System.nanoTime(); // Record start time
        
        List<Bogie> loopFiltered = new ArrayList<>();
        for (Bogie b : bogies) {
            if (b.capacity > 60) {
                loopFiltered.add(b);
            }
        }
        
        long loopEnd = System.nanoTime(); // Record end time
        long loopDuration = loopEnd - loopStart;

        // --- STREAM BASED FILTERING ---
        long streamStart = System.nanoTime(); // Record start time
        
        List<Bogie> streamFiltered = bogies.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());
        
        long streamEnd = System.nanoTime(); // Record end time
        long streamDuration = streamEnd - streamStart;

        // 5. Display Results
        System.out.println("--- Filtering Results (Capacity > 60) ---");
        System.out.println("Loop Filtered Count:   " + loopFiltered.size());
        System.out.println("Stream Filtered Count: " + streamFiltered.size());
        
        System.out.println("\n--- Execution Time Comparison ---");
        System.out.println("Loop-Based Time:   " + loopDuration + " ns");
        System.out.println("Stream-Based Time: " + streamDuration + " ns");
        
        if (loopDuration < streamDuration) {
            System.out.println("\nResult: Loop-based processing was faster in this run.");
        } else {
            System.out.println("\nResult: Stream-based processing was faster in this run.");
        }
    }
}