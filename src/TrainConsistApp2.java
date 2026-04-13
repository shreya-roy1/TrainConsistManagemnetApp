public class TrainConsistApp2 {

    public static void main(String[] args) {

        // Example input
        int[] capacities = {72, 56, 24, 70, 60};

        System.out.println("Before Sorting:");
        PassengerBogieSorter.printArray(capacities);

        // Perform Bubble Sort
        PassengerBogieSorter.bubbleSort(capacities);

        System.out.println("After Sorting:");
        PassengerBogieSorter.printArray(capacities);

        System.out.println("🚆 Sorting completed successfully.");
    }
}