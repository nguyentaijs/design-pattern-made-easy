package io.github.nguyentaijs;

import io.github.nguyentaijs.socket.Volt;

public class LedLight {
    private Volt volt;

    public LedLight(Volt volt) {
        this.volt = volt;
    }

    public boolean turnOn() {
        if (volt.getVolts() != 20) {
            System.err.println("Socket voltage must be 20V. Light is damaged!!!");
            return false;
        }
        System.out.println("Turning on Led Light with " + volt.getVolts() + " volts");
        return true;
    }
}
