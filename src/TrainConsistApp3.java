import java.util.Arrays;

public class TrainConsistApp3 {

    public static void main(String[] args) {

        // Input bogie names
        String[] bogieNames = {"Sleeper", "AC Chair", "First Class", "General", "Luxury"};

        System.out.println("Before Sorting:");
        System.out.println(Arrays.toString(bogieNames));

        // Sorting using Arrays.sort()
        BogieNameSorter.sortBogieNames(bogieNames);

        System.out.println("After Sorting:");
        BogieNameSorter.printBogieNames(bogieNames);

        System.out.println("🚆 Bogie names sorted successfully using Arrays.sort().");
    }
}