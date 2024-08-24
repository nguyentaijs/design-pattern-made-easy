package io.github.nguyentaijs.prototype;

import java.util.Arrays;
import java.util.Objects;

public class Circle extends Shape {
    private int radius;
    private int[] color;

    public Circle() {
    }

    public Circle(Circle target) {
        super(target);
        if (Objects.nonNull(target)) {
            this.radius = target.radius;
            System.out.println("Deep copy");
            this.color = target.color.clone();
        }
    }

    @Override
    public Shape clone() {
        return new Circle(this);
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int[] getColor() {
        return color;
    }

    public void setColor(int[] color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return this.radius == circle.radius && Arrays.equals(this.color, circle.color);
    }
}
