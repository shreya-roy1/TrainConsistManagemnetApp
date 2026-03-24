import java.util.ArrayList;
import java.util.List;

public class UseCase2TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println("=== UC2 - Add Passenger Bogies to Train ===");
        System.out.println("========================================\n");

        // Create an ArrayList to hold passenger bogies
        List<String> passengerBogies = new ArrayList<>();

        // ----- CREATE (Add bogies) -----
        passengerBogies.add("Bogie1");
        passengerBogies.add("Bogie2");
        passengerBogies.add("Bogie3");

        System.out.println("After adding bogies:");
        System.out.println(passengerBogies);

        // ----- READ (Display bogies) -----
        System.out.println("\nCurrent bogie list:");
        for (String bogie : passengerBogies) {
            System.out.println(bogie);
        }

        // ----- UPDATE (Modify a bogie) -----
        passengerBogies.set(1, "Bogie2_Updated");

        System.out.println("\nAfter updating Bogie2:");
        System.out.println(passengerBogies);

        // ----- DELETE (Remove a bogie) -----
        passengerBogies.remove("Bogie1");

        System.out.println("\nAfter removing Bogie1:");
        System.out.println(passengerBogies);

        // ----- CHECK availability -----
        String searchBogie = "Bogie3";
        if (passengerBogies.contains(searchBogie)) {
            System.out.println("\n" + searchBogie + " is available in the train.");
        } else {
            System.out.println("\n" + searchBogie + " is NOT available.");
        }

        // ----- Final consist -----
        System.out.println("\nFinal train consist:");
        System.out.println(passengerBogies);
    }
}