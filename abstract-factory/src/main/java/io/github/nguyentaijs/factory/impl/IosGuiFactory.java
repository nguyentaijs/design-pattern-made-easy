package io.github.nguyentaijs.factory.impl;

import io.github.nguyentaijs.factory.GuiAbstractFactory;
import io.github.nguyentaijs.product.button.Button;
import io.github.nguyentaijs.product.dialog.Dialog;
import io.github.nguyentaijs.product.button.impl.IosButton;
import io.github.nguyentaijs.product.dialog.impl.IosDialog;

public class IosGuiFactory implements GuiAbstractFactory {
    @Override
    public Dialog createDialog() {
        return new IosDialog();
    }

    @Override
    public Button createButton() {

        return new IosButton();
    }
}
