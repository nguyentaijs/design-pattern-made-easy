package car;

public class Car {
    private String manufacturer;
    private String model;
    private String color;
    protected int year;

    public Car(String manufacturer, String model, String color, int year) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.color = color;
        this.year = year;
    }

    // Getters
    public String getManufacturer() { return manufacturer; }
    public String getModel() { return model; }
    public String getColor() { return color; }
    public int getYear() { return year; }

    @Override
    public String toString() {
        return "Car [manufacturer=" + manufacturer + ", model=" + model + ", color=" + color + ", year=" + year + "]";
    }
}
