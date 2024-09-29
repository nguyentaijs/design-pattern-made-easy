package io.github.nguyentaijs;

import io.github.nguyentaijs.socket.Volt;

public class MobileCharger {
    private Volt volt;

    public MobileCharger(Volt volt) {
        this.volt = volt;
    }

    public boolean charge() {
        if (volt.getVolts() != 5) {
            System.err.println("Socket voltage must be 5V. Charger is damaged!!!");
            return false;
        }
        System.out.println("Charging with " + volt.getVolts() + " volts");
        return true;
    }
}
