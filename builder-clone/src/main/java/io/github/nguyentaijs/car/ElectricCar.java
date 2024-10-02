package car;

import builder.Builder;

public class ElectricCar extends Car {
    private int batteryCapacity;

    private ElectricCar(String manufacturer, String model, String color, int year, int batteryCapacity) {
        super(manufacturer, model, color, year);
        this.batteryCapacity = batteryCapacity;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    @Override
    public String toString() {
        return super.toString() + ", batteryCapacity=" + batteryCapacity;
    }

}
