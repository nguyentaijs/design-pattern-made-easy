package io.github.nguyentaijs.prototypespring.prototype;

import jakarta.annotation.PostConstruct;
import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Scope("prototype")
@Getter
@Setter
public class Circle extends Shape {
    private int radius;
    private int[] color;

    public Circle() {
    }

    @PostConstruct
    private void init() {
        x = 2;
        y = 2;
        radius = 5;
        color = new int[]{255,255,255};
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return this.radius == circle.radius && Arrays.equals(this.color, circle.color);
    }
}
