package builder;

import car.Car;

public class CarBuilder implements Builder {
    private String manufacturer;
    private String model;
    private String color;
    protected int year;

    @Override
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void setYear(int year) {
        this.year = year;
    }

    public Car build() {
        return new Car(manufacturer, model, color, year);
    }
}
