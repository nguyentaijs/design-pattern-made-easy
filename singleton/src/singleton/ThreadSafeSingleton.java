package singleton;

import java.util.Objects;

public class ThreadSafeSingleton {
    private static volatile ThreadSafeSingleton instance;
    private ThreadSafeSingleton() {}

    /**
     * Get instance
     * Using double-checked locking mechanism
     * @return instance
     */
    public static ThreadSafeSingleton getInstance() {
        ThreadSafeSingleton result = instance;
        if(Objects.nonNull(result)) {
            return result;
        }
        synchronized (ThreadSafeSingleton.class) {
            if (Objects.isNull(instance)) {
                instance = new ThreadSafeSingleton();
            }
            return instance;
        }
    }
}
