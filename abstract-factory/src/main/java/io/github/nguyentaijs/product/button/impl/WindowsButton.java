package io.github.nguyentaijs.product.button.impl;

import io.github.nguyentaijs.product.button.Button;

public class WindowsButton implements Button {
    @Override
    public void render() {
        System.out.println("Windows button rendered");
    }

    @Override
    public void click() {
        System.out.println("Windows button clicked");
    }
}
