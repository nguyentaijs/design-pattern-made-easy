package io.github.nguyentaijs;

import io.github.nguyentaijs.prototype.Circle;

import java.util.Arrays;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Circle circle = createCircle();
        Circle cloneCircle = (Circle) circle.clone();
        System.out.println(circle.equals(cloneCircle) ? "They are EQUAL" : "They are not EQUAL");

        // Change clone Circle color
        int[] color = cloneCircle.getColor();
        color[0] = 200;
        System.out.println("\nAfter update clone Circle's RGB color to [200,255,255] ...");
        System.out.printf("Original color = %s%n", Arrays.toString(circle.getColor()));
        System.out.printf("Clone color = %s%n", Arrays.toString(cloneCircle.getColor()));
        System.out.println(circle.equals(cloneCircle) ? "They are EQUAL" : "They are not EQUAL");
    }

    private static Circle createCircle() {
        Circle circle = new Circle();
        circle.setX(2);
        circle.setY(2);
        circle.setRadius(5);
        circle.setColor(new int[]{255, 255, 255});
        return circle;
    }
}
