class CargoSafetyException extends RuntimeException {
    public CargoSafetyException(String message) {
        super(message);
    }
}

class GoodsBogie {
    private String shape;
    private String cargo;

    public GoodsBogie(String shape) {
        this.shape = shape;
    }

    public void assignCargo(String cargoType) {
        try {
            if (shape.equalsIgnoreCase("Rectangular") &&
                cargoType.equalsIgnoreCase("Petroleum")) {

                throw new CargoSafetyException(
                    "Unsafe Assignment! Petroleum cannot be loaded in Rectangular Bogie."
                );
            }

            this.cargo = cargoType;
            System.out.println("✅ Cargo '" + cargoType + "' assigned to " + shape + " bogie.");

        } catch (CargoSafetyException e) {
            System.out.println("❌ Error: " + e.getMessage());

        } finally {
            System.out.println("🔄 Assignment attempt completed for " + shape + " bogie.\n");
        }
    }

    public String getCargo() {
        return cargo;
    }
}

public class TrainConsistApp {
    public static void main(String[] args) {

        GoodsBogie bogie1 = new GoodsBogie("Cylindrical");
        bogie1.assignCargo("Petroleum");

        GoodsBogie bogie2 = new GoodsBogie("Rectangular");
        bogie2.assignCargo("Petroleum");

        GoodsBogie bogie3 = new GoodsBogie("Rectangular");
        bogie3.assignCargo("Grains");

        System.out.println("🚆 System continues safely after handling exceptions.");
    }
}