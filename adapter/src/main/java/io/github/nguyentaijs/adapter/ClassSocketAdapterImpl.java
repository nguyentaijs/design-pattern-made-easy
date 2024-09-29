package io.github.nguyentaijs.adapter;

import io.github.nguyentaijs.socket.Socket;
import io.github.nguyentaijs.socket.Volt;

public class ClassSocketAdapterImpl extends Socket implements SocketAdapter {
    @Override
    public Volt get110Volts() {
        return convertVolt(getVolt(), 2);
    }

    @Override
    public Volt get20Volts() {
        return convertVolt(getVolt(), 11);
    }

    @Override
    public Volt get5Volts() {
        return convertVolt(getVolt(), 44);
    }

    private Volt convertVolt(Volt v, int divisor) {
        return new Volt(v.getVolts() / divisor);
    }
}
