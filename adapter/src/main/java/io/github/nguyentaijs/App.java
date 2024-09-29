package io.github.nguyentaijs;

import io.github.nguyentaijs.adapter.ClassSocketAdapterImpl;
import io.github.nguyentaijs.adapter.ObjectSocketAdapterImpl;
import io.github.nguyentaijs.socket.Socket;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        Socket socket = new Socket();
        ObjectSocketAdapterImpl adapter = new ObjectSocketAdapterImpl(socket);
        TV tv = new TV(socket.getVolt()); // TV - 220V
        JapaneseCooker cooker = new JapaneseCooker(adapter.get110Volts()); // JapaneseCooker - 110V
        LedLight ledLight = new LedLight(adapter.get20Volts()); // LedLight - 20V
        MobileCharger charger = new MobileCharger(adapter.get5Volts()); // MobileCharger - 5V

        turnOnAllDevices(tv, cooker, ledLight, charger);
    }

    private static void failCase() {
        Socket socket = new Socket();
        TV tv = new TV(socket.getVolt());
        JapaneseCooker cooker = new JapaneseCooker(socket.getVolt());
        LedLight ledLight = new LedLight(socket.getVolt());
        MobileCharger charger = new MobileCharger(socket.getVolt());

        turnOnAllDevices(tv, cooker, ledLight, charger);
    }

    private static void turnOnAllDevices(TV tv, JapaneseCooker cooker, LedLight ledLight, MobileCharger charger) {
        System.out.println("Turning on all devices...");
        int damagedDevices = 0;
        damagedDevices += tv.powerOn() ? 0 : 1;
        damagedDevices += cooker.cook()? 0 : 1;
        damagedDevices += ledLight.turnOn()? 0 : 1;
        damagedDevices += charger.charge()? 0 : 1;

        System.out.println("---");
        System.out.println("Total damaged devices:" + damagedDevices);
    }
}
