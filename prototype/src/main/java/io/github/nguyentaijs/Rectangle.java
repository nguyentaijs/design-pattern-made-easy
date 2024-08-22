package io.github.nguyentaijs;

import java.util.Objects;

public class Rectangle extends Shape{
    private int width;
    private int height;

    public Rectangle(){}

    public Rectangle(Rectangle target) {
        super(target);
        if (Objects.nonNull(target)) {
            this.width = target.width;
            this.height = target.height;
        }
    }

    @Override
    public Shape clone() {
        return new Rectangle(this);
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
