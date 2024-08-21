package io.github.nguyentaijs.product.dialog.impl;

import io.github.nguyentaijs.product.dialog.Dialog;

public class WindowsDialog implements Dialog {
    @Override
    public void show() {
        System.out.println("Windows dialog shown");
    }
    @Override
    public void render() {
        System.out.println("Windows dialog rendered");
    }
}
