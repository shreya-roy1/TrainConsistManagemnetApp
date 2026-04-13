class PassengerBogieSorter {

    // Bubble Sort Method
    public static void bubbleSort(int[] capacities) {
        int n = capacities.length;

        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false; // Optimization

            for (int j = 0; j < n - i - 1; j++) {
                if (capacities[j] > capacities[j + 1]) {
                    // Swap
                    int temp = capacities[j];
                    capacities[j] = capacities[j + 1];
                    capacities[j + 1] = temp;

                    swapped = true;
                }
            }

            // If no swaps → already sorted
            if (!swapped) break;
        }
    }

    // Utility method to print array
    public static void printArray(int[] capacities) {
        for (int cap : capacities) {
            System.out.print(cap + " ");
        }
        System.out.println();
    }
}