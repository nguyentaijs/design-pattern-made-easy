package io.github.nguyentaijs;

import java.util.Objects;

public class Circle extends Shape{
    private int radius;

    public Circle(Circle target) {
        super(target);
        if (Objects.nonNull(target)) {
            this.radius = target.radius;
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
}
