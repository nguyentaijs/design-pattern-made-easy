package io.github.nguyentaijs.product.button.impl;

import io.github.nguyentaijs.product.button.Button;

public class IosButton implements Button {
    @Override
    public void render() {
        System.out.println("iOS button rendered");
    }

    @Override
    public void click() {
        System.out.println("iOS button clicked");

    }
}
