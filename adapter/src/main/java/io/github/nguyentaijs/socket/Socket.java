package io.github.nguyentaijs.socket;

public class Socket {
    private Volt volt;
    public Socket() {
        this.volt = new Volt(220);
    }

    public Volt getVolt() {
        return volt;
    }
}
