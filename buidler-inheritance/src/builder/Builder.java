package builder;

import car.Car;

public interface Builder<T extends Builder<T>> {
    T setManufacturer(String make);
    T setModel(String model);
    T setColor(String color);
    T setYear(int year);
    Car build();
}
