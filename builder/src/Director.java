import car.Builder;

public class Director {
    public void buildXForce(Builder builder) {
        System.out.println("Building X-Force...");
        builder.setManufacturer("Mitsubishi");
        builder.setColor("White");
        builder.setModel("xForce");
        builder.setYear(2024);
    }

    public void buildSantafe(Builder builder) {
        System.out.println("Building SantaFe...");
        builder.setManufacturer("Hyundai");
        builder.setColor("Blue");
        builder.setModel("SantaFe");
        builder.setYear(2025);
    }
}
