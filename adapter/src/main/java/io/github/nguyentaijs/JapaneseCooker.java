package io.github.nguyentaijs;

import io.github.nguyentaijs.socket.Volt;

public class JapaneseCooker {
    private Volt volt;

    public JapaneseCooker(Volt volt) {
        this.volt = volt;
    }

    public boolean cook() {
        if (volt.getVolts() != 110) {
            System.err.println("Socket voltage must be 110V. Cooker is damaged!!!");
            return false;
        }
        System.out.println("Cooking with " + volt.getVolts() + " volts");
        return true;
    }
}
