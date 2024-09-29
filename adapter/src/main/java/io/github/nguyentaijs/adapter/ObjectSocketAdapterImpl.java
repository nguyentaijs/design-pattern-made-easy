package io.github.nguyentaijs.adapter;

import io.github.nguyentaijs.socket.Socket;
import io.github.nguyentaijs.socket.Volt;

public class ObjectSocketAdapterImpl implements SocketAdapter {
    private Socket socket;

    public ObjectSocketAdapterImpl(Socket socket) {
        this.socket = socket;
    }
    @Override
    public Volt get110Volts() {
        return convertVolt(socket.getVolt(), 2);
    }

    @Override
    public Volt get20Volts() {
        return convertVolt(socket.getVolt(), 11);
    }

    @Override
    public Volt get5Volts() {
        return convertVolt(socket.getVolt(), 44);
    }

    private Volt convertVolt(Volt v, int divisor) {
        return new Volt(v.getVolts() / divisor);
    }
}
