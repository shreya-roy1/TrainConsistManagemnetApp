import java.util.ArrayList;
import java.util.List;

public class UseCase12TrainConsistMgmt {

    // GoodsBogie class with type and cargo properties
    static class GoodsBogie {
        String type;  // e.g., "Cylindrical", "Open", "Box"
        String cargo; // e.g., "Petroleum", "Coal", "Grain"

        GoodsBogie(String type, String cargo) {
            this.type = type;
            this.cargo = cargo;
        }

        @Override
        public String toString() {
            return String.format("GoodsBogie[Type=%s, Cargo=%s]", type, cargo);
        }
    }

    public static void main(String[] args) {
        System.out.println("===============================================");
        System.out.println(" UC12 - Safety Compliance Check (allMatch) ");
        System.out.println("===============================================\n");

        // 1. User prepares a list of goods bogies
        List<GoodsBogie> goodsConsist = new ArrayList<>();
        goodsConsist.add(new GoodsBogie("Open", "Coal"));
        goodsConsist.add(new GoodsBogie("Cylindrical", "Petroleum"));
        goodsConsist.add(new GoodsBogie("Box", "Grain"));
        goodsConsist.add(new GoodsBogie("Cylindrical", "Petroleum"));

        System.out.println("--- Inspecting Goods Consist ---");
        goodsConsist.forEach(System.out::println);

        // 2. System converts list into a stream
        // 3. allMatch() checks every bogie against safety rules
        // 4. Conditional logic: If type is Cylindrical, cargo MUST be Petroleum
        boolean isSafe = goodsConsist.stream().allMatch(bogie -> {
            if (bogie.type.equalsIgnoreCase("Cylindrical")) {
                return bogie.cargo.equalsIgnoreCase("Petroleum");
            }
            // Non-cylindrical bogies are flexible (default to true)
            return true;
        });

        // 5. Result is displayed
        System.out.println("\n-----------------------------------------------");
        if (isSafe) {
            System.out.println(" STATUS: SAFE - All safety protocols met.");
        } else {
            System.out.println(" STATUS: UNSAFE - Invalid cargo in Cylindrical bogie!");
        }
        System.out.println("-----------------------------------------------");
    }
}