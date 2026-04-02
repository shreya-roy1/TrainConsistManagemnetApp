import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UseCase11TrainConsistMgmt {

    public static void main(String[] args) {
        System.out.println("===============================================");
        System.out.println(" UC11 - Validate Train ID & Cargo Codes (Regex) ");
        System.out.println("===============================================\n");

        // 1. User enters the Train ID and Cargo Code (Mocking input)
        String[] testTrainIDs = {"TRN-1234", "TRAIN12", "TRN-123", "TRN-12345"};
        String[] testCargoCodes = {"PET-AB", "PET-ab", "PET123", "AB-PET"};

        // 2. System compiles regex patterns
        // Train ID: "TRN-" followed by exactly 4 digits
        String trainIdRegex = "TRN-\\d{4}"; 
        // Cargo Code: "PET-" followed by exactly 2 uppercase letters
        String cargoCodeRegex = "PET-[A-Z]{2}";

        Pattern trainPattern = Pattern.compile(trainIdRegex);
        Pattern cargoPattern = Pattern.compile(cargoCodeRegex);

        System.out.println("--- Validating Train IDs ---");
        for (String id : testTrainIDs) {
            // 3. Matcher checks input against the pattern
            Matcher matcher = trainPattern.matcher(id);
            // 4. matches() verifies if the entire string conforms
            if (matcher.matches()) {
                System.out.println("✔ Valid:   " + id);
            } else {
                System.out.println("❌ Invalid: " + id + " (Expected format: TRN-DDDD)");
            }
        }

        System.out.println("\n--- Validating Cargo Codes ---");
        for (String code : testCargoCodes) {
            Matcher matcher = cargoPattern.matcher(code);
            if (matcher.matches()) {
                System.out.println("✔ Valid:   " + code);
            } else {
                System.out.println("❌ Invalid: " + code + " (Expected format: PET-AA)");
            }
        }
    }
}