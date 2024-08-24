package io.github.nguyentaijs.prototypespring;

import io.github.nguyentaijs.prototypespring.prototype.Circle;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class PrototypeSpringApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(PrototypeSpringApplication.class, args);
        Circle firstCircle = context.getBean(Circle.class);
        Circle secondCircle = context.getBean(Circle.class);

        System.out.println(firstCircle.equals(secondCircle) ? "They are EQUAL" : "They are not EQUAL");

        // Change clone Circle color
        int[] color = secondCircle.getColor();
        color[0] = 200;

        System.out.println("\nAfter update second Circle's RGB color to [200,255,255] ...");
        System.out.printf("First color = %s%n", Arrays.toString(firstCircle.getColor()));
        System.out.printf("Second color = %s%n", Arrays.toString(secondCircle.getColor()));
        System.out.println(firstCircle.equals(secondCircle) ? "They are EQUAL" : "They are not EQUAL");
    }

}
