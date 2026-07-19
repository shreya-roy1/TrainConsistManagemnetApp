class PassengerBogieSorter {

    /**
     * Sorts the passenger capacities array using the Bubble Sort algorithm.
     * Includes null check optimization and handles edge cases gracefully.
     *
     * @param capacities Array of passenger capacities to be sorted.
     */
    public static void bubbleSort(int[] capacities) {
        if (capacities == null || capacities.length <= 1) {
            return; // Already sorted or nothing to sort
        }

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

    /**
     * Utility method to print the capacities array.
     * Handles null values gracefully.
     *
     * @param capacities Array of passenger capacities to print.
     */
    public static void printArray(int[] capacities) {
        if (capacities == null) {
            System.out.println("[]");
            return;
        }
        for (int i = 0; i < capacities.length; i++) {
            System.out.print(capacities[i]);
            if (i < capacities.length - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}