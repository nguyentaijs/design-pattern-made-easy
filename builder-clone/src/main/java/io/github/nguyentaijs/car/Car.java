package car;

import builder.Builder;

public class Car {
    protected String manufacturer;
    protected String model;
    protected String color;
    protected int year;

    protected Car(String manufacturer, String model, String color, int year) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.color = color;
        this.year = year;
    }

    // Getters
    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Car [manufacturer=" + manufacturer + ", model=" + model + ", color=" + color + ", year=" + year + "]";
    }

    public static class CarBuilder implements Builder<CarBuilder> {
        private String manufacturer;
        private String model;
        private String color;
        protected int year;

        @Override
        public CarBuilder setManufacturer(String manufacturer) {
            this.manufacturer = manufacturer;
            return this;
        }

        @Override
        public CarBuilder setModel(String model) {
            this.model = model;
            return this;
        }

        @Override
        public CarBuilder setColor(String color) {
            this.color = color;
            return this;
        }

        @Override
        public CarBuilder setYear(int year) {
            this.year = year;
            return this;
        }

        public Car build() {
            return new Car(manufacturer, model, color, year);
        }
    }
}
