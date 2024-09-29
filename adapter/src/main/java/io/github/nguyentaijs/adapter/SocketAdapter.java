package io.github.nguyentaijs.adapter;

import io.github.nguyentaijs.socket.Volt;

public interface SocketAdapter {
   Volt get110Volts();
   Volt get20Volts();
   Volt get5Volts();
}
