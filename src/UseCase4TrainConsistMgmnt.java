import java.util.LinkedList;
import java.util.List;

/**
 * =========================================================
 * MAIN CLASS - UseCase4TrainConsistMgmnt
 * =========================================================
 * Use Case 4: Maintain Ordered Bogie Consist
 * * Description:
 * This class models the physical chaining of train bogies
 * using LinkedList for ordered operations.
 */
public class UseCase4TrainConsistMgmnt {

    public static void main(String[] args) {
        System.out.println("==============================================");
        System.out.println(" UC4 - Maintain Ordered Bogie Consist ");
        System.out.println("==============================================\n");

        // Create a LinkedList
        // LinkedList maintains insertion order and allows fast inserts
        LinkedList<String> trainConsist = new LinkedList<>();

        // 1. Adds bogies in sequence (at the end)
        trainConsist.add("Engine");
        trainConsist.add("Bogie 1");
        trainConsist.add("Bogie 2");
        trainConsist.add("Guard Van");
        System.out.println("Initial Train Structure: " + trainConsist);

        // 2. Inserts bogies at specific positions
        // Inserting "Bogie 1.5" at index 2
        trainConsist.add(2, "Bogie 1.5");
        System.out.println("After Insertion at position 2: " + trainConsist);

        // 3. Removes bogies from front and rear
        if (!trainConsist.isEmpty()) {
            trainConsist.removeFirst(); // Removes Engine
            trainConsist.removeLast();  // Removes Guard Van
        }
        System.out.println("After Removing Front and Rear: " + trainConsist);

        // 4. Displays updated train structure
        System.out.println("\nFinal Train Consist Structure:");
        int position = 1;
        for (String bogie : trainConsist) {
            System.out.println("Position " + position + ": " + bogie);
            position++;
        }
    }
}