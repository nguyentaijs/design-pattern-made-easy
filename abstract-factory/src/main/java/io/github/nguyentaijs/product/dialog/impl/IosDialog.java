package io.github.nguyentaijs.product.dialog.impl;

import io.github.nguyentaijs.product.dialog.Dialog;

public class IosDialog implements Dialog {
    @Override
    public void show() {
        System.out.println("iOS dialog shown");
    }
    @Override
    public void render() {
        System.out.println("iOS dialog rendered");
    }
}
