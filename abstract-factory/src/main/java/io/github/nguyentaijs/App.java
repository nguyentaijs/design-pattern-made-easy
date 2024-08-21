package io.github.nguyentaijs;

import io.github.nguyentaijs.client.Application;
import io.github.nguyentaijs.factory.impl.IosGuiFactory;
import io.github.nguyentaijs.factory.impl.WindowsGuiFactory;

/**
 * Hello world!
 *
 */
public class App {
    public static final String OS_WIN = "win";
    public static final String OS_MAC = "mac";

    public static void main(String[] args) {
        Application application;
        String os = System.getProperty("os.name").toLowerCase();
        if (os.contains(OS_WIN)) {
            application = new Application(new WindowsGuiFactory());
        } else if (os.contains(OS_MAC)) {
            application = new Application(new IosGuiFactory());
        } else {
            System.err.println("Can not recognize os.");
            return;
        }

        application.render();
        application.interact();
    }
}
