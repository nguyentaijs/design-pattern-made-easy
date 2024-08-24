package io.github.nguyentaijs.prototype;

import java.util.Objects;

public abstract class Shape {
    int x;
    int y;

    public Shape() {
    }

    public Shape(Shape target) {
        if (Objects.nonNull(target)) {
            this.x = target.x;
            this.y = target.y;
        }
    }

    public abstract Shape clone();

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
