package io.github.nguyentaijs.abstractfactoryspring.product.dialog.impl;

import io.github.nguyentaijs.abstractfactoryspring.product.dialog.Dialog;
import org.springframework.stereotype.Component;

@Component
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
