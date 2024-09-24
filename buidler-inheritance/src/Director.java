import car.Car;
import car.ElectricCar;

public class Director {
    public Car buildXForce() {
        System.out.println("Building X-Force...");
        return new Car.CarBuilder()
                .setManufacturer("Mitsubishi")
                .setColor("White")
                .setModel("xForce")
                .setYear(2024)
                .build();
    }

    public Car buildSantafe() {
        System.out.println("Building SantaFe...");
        return new Car.CarBuilder()
                .setManufacturer("Hyundai")
                .setColor("Blue")
                .setModel("SantaFe")
                .setYear(2025)
                .build();
    }

    public ElectricCar buildlVF3() {
        System.out.println("Building VF3...");
        return new ElectricCar.ElectricCarBuilder()
                .setManufacturer("Vinfast")
                .setColor("Red")
                .setModel("VF3")
                .setYear(2025)
                .setBatteryCapacity(9000)
                .build();
    }
}
