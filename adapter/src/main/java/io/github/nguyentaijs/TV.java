package io.github.nguyentaijs;

import io.github.nguyentaijs.socket.Volt;

public class TV {
    private Volt volt;

    public TV(Volt volt) {
        this.volt = volt;
    }

    public boolean powerOn() {
        if (volt.getVolts() != 220) {
            System.err.println("Socket voltage must be 220V. TV is damaged!!!");
            return false;
        }
        System.out.println("Turning on TV with " + volt.getVolts() + " volts");
        return true;
    }
}
