package singleton;

import java.util.Objects;

public class NaiveSingleton {
    private static NaiveSingleton instance;
    private NaiveSingleton() {}

    public static NaiveSingleton getInstance() {
        if(Objects.isNull(instance)) {
            instance = new NaiveSingleton();
        }
        return instance;
    }
}
