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

    public static class ElectricCarBuilder implements Builder<ElectricCarBuilder> {
        private String manufacturer;
        private String model;
        private String color;
        private int year;
        private int batteryCapacity;

        @Override
        public ElectricCarBuilder setManufacturer(String manufacturer) {
            this.manufacturer = manufacturer;
            return this;
        }

        @Override
        public ElectricCarBuilder setModel(String model) {
            this.model = model;
            return this;
        }

        @Override
        public ElectricCarBuilder setColor(String color) {
            this.color = color;
            return this;
        }

        @Override
        public ElectricCarBuilder setYear(int year) {
            this.year = year;
            return this;
        }

        public ElectricCarBuilder setBatteryCapacity(int batteryCapacity) {
            this.batteryCapacity = batteryCapacity;
            return this;
        }

        public ElectricCar build() {
            return new ElectricCar(manufacturer, model, color, year, batteryCapacity);
        }
    }
}
