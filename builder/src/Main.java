import car.Car;
import car.CarBuilder;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();

        CarBuilder santaFeBuilder = new CarBuilder();
        director.buildSantafe(santaFeBuilder);

        Car santaFe = santaFeBuilder.build();
        System.out.println(santaFe);

        CarBuilder xForceBuilder = new CarBuilder();
        director.buildXForce(xForceBuilder);

        Car xForce = xForceBuilder.build();
        System.out.println(xForce);
    }
}