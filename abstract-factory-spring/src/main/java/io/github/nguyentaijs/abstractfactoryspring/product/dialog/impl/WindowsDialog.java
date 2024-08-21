package io.github.nguyentaijs.abstractfactoryspring.product.dialog.impl;

import io.github.nguyentaijs.abstractfactoryspring.product.dialog.Dialog;
import org.springframework.stereotype.Component;

@Component
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
