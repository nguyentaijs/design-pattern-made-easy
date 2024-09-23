import car.Car;
import car.ElectricCar;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();

        Car santaFe = director.buildSantafe();
        System.out.println(santaFe);

        Car xForce = director.buildXForce();
        System.out.println(xForce);

        ElectricCar vf3 = director.buildlVF3();
        System.out.println(vf3);
    }
}